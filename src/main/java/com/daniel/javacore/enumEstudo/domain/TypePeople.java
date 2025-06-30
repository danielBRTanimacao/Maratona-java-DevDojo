package com.daniel.javacore.enumEstudo.domain;

public enum TypePeople {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    public final int VALOR;
    private String DESCRIPTION;

    TypePeople(int valor, String description) {
        this.VALOR = valor;
        this.DESCRIPTION = description;
    }

    TypePeople(int valor) {
        this.VALOR = valor;
    }

    public int getValor() {
        return this.VALOR;
    }

    public String getDescription() {
        return this.DESCRIPTION;
    }
}
