package com.marciosalesdev.EventClean.infrastructure.beans;

import com.marciosalesdev.EventClean.core.gateway.EventoGateway;
import com.marciosalesdev.EventClean.core.usecases.BuscarEventoCaseImpl;
import com.marciosalesdev.EventClean.core.usecases.BuscarEventoUseCase;
import com.marciosalesdev.EventClean.core.usecases.CriarEventUseCase;
import com.marciosalesdev.EventClean.core.usecases.CriarEventoCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CriarEventUseCase criaEvento(EventoGateway eventoGateway) {
        return new CriarEventoCaseImpl(eventoGateway);
    }

    @Bean
    public BuscarEventoUseCase buscarEvento(EventoGateway eventoGateway) {
        return new BuscarEventoCaseImpl(eventoGateway);
    }

}