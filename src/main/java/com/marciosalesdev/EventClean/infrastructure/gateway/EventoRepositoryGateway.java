package com.marciosalesdev.EventClean.infrastructure.gateway;

import com.marciosalesdev.EventClean.core.entities.Evento;
import com.marciosalesdev.EventClean.core.gateway.EventoGateway;
import com.marciosalesdev.EventClean.infrastructure.mapper.EventoEntityMapper;
import com.marciosalesdev.EventClean.infrastructure.persistence.EventoEntity;
import com.marciosalesdev.EventClean.infrastructure.persistence.EventoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventoRepositoryGateway implements EventoGateway {

    private final EventoRepository eventoRepository;
    private final EventoEntityMapper eventoEntityMapper;

    public EventoRepositoryGateway(EventoRepository eventoRepository, EventoEntityMapper eventoEntityMapper) {
        this.eventoRepository = eventoRepository;
        this.eventoEntityMapper = eventoEntityMapper;
    }


    @Override
    public Evento criarEvento(Evento evento) {
        EventoEntity evento1 = eventoEntityMapper.toEventoEntity(evento);
        EventoEntity eventoNovo = eventoRepository.save(evento1);
        return eventoEntityMapper.toEvento(eventoNovo);
    }

    @Override
    public List<Evento> buscarEventos() {
        return eventoRepository.findAll().stream().map(eventoEntityMapper::toEvento).toList();
    }

}
