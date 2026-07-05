package com.marciosalesdev.EventClean.core.usecases;

import com.marciosalesdev.EventClean.core.entities.Evento;

import java.util.List;

public interface BuscarEventoUseCase {

    List<Evento> execute();
}
