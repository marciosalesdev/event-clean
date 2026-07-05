package com.marciosalesdev.EventClean.core.gateway;

import com.marciosalesdev.EventClean.core.entities.Evento;

import java.util.List;

public interface EventoGateway {

    Evento criarEvento(Evento evento);

    List<Evento> buscarEventos();
}
