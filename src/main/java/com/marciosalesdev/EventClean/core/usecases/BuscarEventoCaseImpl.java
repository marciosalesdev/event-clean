package com.marciosalesdev.EventClean.core.usecases;

import com.marciosalesdev.EventClean.core.entities.Evento;
import com.marciosalesdev.EventClean.core.gateway.EventoGateway;

import java.util.List;


public class BuscarEventoCaseImpl implements BuscarEventoUseCase {

    private final EventoGateway eventoGateway;

    public BuscarEventoCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public List<Evento> execute() {
        return eventoGateway.buscarEventos();
    }
}
