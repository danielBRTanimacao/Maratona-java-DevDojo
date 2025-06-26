package com.daniel.javacore.introducao.arrayObjetos.dominio;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
    private String nome;
    private Time time; // pode possuir nenhum ou 1 time

    public Player(String nome) {
        this.nome = nome;
    }

    public void print() {
        System.out.println(nome);
        if (this.time != null) {
            System.out.println(time.getNome());
        }
    }

}
