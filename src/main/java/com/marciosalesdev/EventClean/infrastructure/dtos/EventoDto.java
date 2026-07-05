package com.marciosalesdev.EventClean.infrastructure.dtos;

import com.marciosalesdev.EventClean.core.enuns.TipoEvento;

import java.time.LocalDateTime;

public record EventoDto(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        String localEvento,
        Integer capacidade,
        String organizador,
        TipoEvento tipoEvento
) {
}
