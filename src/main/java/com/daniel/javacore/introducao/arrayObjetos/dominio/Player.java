package com.daniel.javacore.introducao.arrayObjetos.dominio;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
    private String nome;

    public Player(String nome) {
        this.nome = nome;
    }

    public void print() {
        System.out.println(nome);
    }

}
