package com.daniel.javacore.enumEstudo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private String nome;
    private TypePeople type; // Versão recomendada
    /*public enum TypePeople { // Outra maneira de fazer não muito recomendado
        PESSOA_FISICA,
        PESSOA_JURIDICA
    }*/
    private TypePayment typePayment;

    public Client(String nome) {
        this.nome = nome;
        this.type = TypePeople.PESSOA_FISICA;
        this.typePayment = TypePayment.CREDIT;
    }

    public Client(String nome, TypePeople type) {
        this.nome = nome;
        this.type = type;
        this.typePayment = TypePayment.CREDIT;
    }

    public Client(String nome, TypePeople type,  TypePayment typePayment) {
        this.nome = nome;
        this.type = type;
        this.typePayment = typePayment;
    }

    public final void print() {
        System.out.println(this.nome);
        System.out.println(this.type.getDescription());
        System.out.println(this.typePayment);
    }

}
