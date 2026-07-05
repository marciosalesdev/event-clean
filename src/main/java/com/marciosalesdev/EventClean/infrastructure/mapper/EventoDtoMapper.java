package com.marciosalesdev.EventClean.infrastructure.mapper;

import com.marciosalesdev.EventClean.core.entities.Evento;
import com.marciosalesdev.EventClean.infrastructure.dtos.EventoDto;
import org.springframework.stereotype.Component;

@Component
public class EventoDtoMapper {


    public EventoDto toDomain(Evento evento) {
        return new EventoDto(
                evento.id(),
                evento.nome(),
                evento.descricao(),
                evento.identificador(),
                evento.dataInicio(),
                evento.dataFim(),
                evento.localEvento(),
                evento.capacidade(),
                evento.organizador(),
                evento.tipoEvento()
        );
    }

    public Evento toEvento(EventoDto evento) {
        return new Evento(
                evento.id(),
                evento.nome(),
                evento.descricao(),
                evento.identificador(),
                evento.dataInicio(),
                evento.dataFim(),
                evento.localEvento(),
                evento.capacidade(),
                evento.organizador(),
                evento.tipoEvento()
        );
    }
}
