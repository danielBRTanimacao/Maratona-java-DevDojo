package com.daniel.javacore.introducao.associacao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }
}
