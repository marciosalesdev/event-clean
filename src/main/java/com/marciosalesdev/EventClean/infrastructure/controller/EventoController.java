package com.marciosalesdev.EventClean.infrastructure.controller;

import com.marciosalesdev.EventClean.core.entities.Evento;
import com.marciosalesdev.EventClean.core.usecases.BuscarEventoUseCase;
import com.marciosalesdev.EventClean.core.usecases.CriarEventUseCase;
import com.marciosalesdev.EventClean.infrastructure.dtos.EventoDto;
import com.marciosalesdev.EventClean.infrastructure.mapper.EventoDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(path = "/api/v1")
@RestController
@RequiredArgsConstructor
public class EventoController {

    private final CriarEventUseCase criarEventUseCase;
    private final EventoDtoMapper eventoDtoMapper;
    private final BuscarEventoUseCase buscarEventoUseCase;

    @PostMapping("/criarevento")
    public ResponseEntity<Map<String, Object>> criarEvento(@RequestBody EventoDto eventoDto) {
        Evento evento = criarEventUseCase
                .execute(eventoDtoMapper
                        .toEvento(eventoDto));
        Map<String, Object> response = new HashMap<>();
        response.put("Message: ", "Evento criado com sucesso no nosso banco de dados. ");
        response.put("Dados do evento : ", eventoDtoMapper.toDomain(evento));

        return ResponseEntity.ok(response);
    }

    @GetMapping("/buscarevento")
    public List<EventoDto> buscarEventos() {
        return buscarEventoUseCase
                .execute()
                .stream()
                .map(eventoDtoMapper::toDomain)
                .toList();
    }
}
