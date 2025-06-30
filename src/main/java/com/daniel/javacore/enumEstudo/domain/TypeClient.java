package com.daniel.javacore.enumEstudo.domain;

public enum TypeClient {
    PESSOA_JURIDICA(1),
    PESSOA_FISICA(2);

    public final int VALOR; // Por um exmplxo estatico ele existe antes de iniciar

    TypeClient(int valor) {
        this.VALOR = valor;
    }

    public int getValor() {
        return this.VALOR;
    }

}
