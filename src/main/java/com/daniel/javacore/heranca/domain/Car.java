package com.daniel.javacore.heranca.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    protected String name;
    // Para constantes finais recomendado palavras maiusculas utilizando thunder
    //public static final double VELOCITY_LIMIT = 285;
    public final double VELOCITY_LIMIT;
    // Geralmente vem acompanhado do metodo STATIC

    public final Buyer BUYER = new Buyer();

    {
        VELOCITY_LIMIT = 300;
    }

    public Car(String name) {
        this.name = name;
    }
}
