package com.marciosalesdev.EventClean.core.usecases;

import com.marciosalesdev.EventClean.core.entities.Evento;
import com.marciosalesdev.EventClean.core.gateway.EventoGateway;

public class CriarEventoCaseImpl implements CriarEventUseCase{

    private final EventoGateway eventoGateway;

    public CriarEventoCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    public Evento execute(Evento evento) {
        return eventoGateway.criarEvento(evento);
    }
}
