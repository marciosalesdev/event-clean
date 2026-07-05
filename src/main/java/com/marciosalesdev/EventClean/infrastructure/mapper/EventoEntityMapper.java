package com.marciosalesdev.EventClean.infrastructure.mapper;

import com.marciosalesdev.EventClean.core.entities.Evento;
import com.marciosalesdev.EventClean.infrastructure.persistence.EventoEntity;
import org.springframework.stereotype.Component;

@Component
public class EventoEntityMapper {


    public EventoEntity toEventoEntity(Evento evento) {
        return new EventoEntity(
                evento.id(),
                evento.nome(),
                evento.descricao(),
                evento.identificador(),
                evento.dataInicio(),
                evento.dataFim(),
                evento.localEvento(),
                evento.capacidade(),
                evento.organizador(),
                evento.tipoEvento());

    }

    public Evento toEvento(EventoEntity eventoEntity) {
        return new Evento(
                eventoEntity.getId(),
                eventoEntity.getNome(),
                eventoEntity.getDescricao(),
                eventoEntity.getIdentificador(),
                eventoEntity.getDataInicio(),
                eventoEntity.getDataFim(),
                eventoEntity.getLocalEvento(),
                eventoEntity.getCapacidade(),
                eventoEntity.getOrganizador(),
                eventoEntity.getTipoEvento()
        );
    }
}
