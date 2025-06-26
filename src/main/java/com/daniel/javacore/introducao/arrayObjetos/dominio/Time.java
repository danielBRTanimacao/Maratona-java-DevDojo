package com.daniel.javacore.introducao.arrayObjetos.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }
}
