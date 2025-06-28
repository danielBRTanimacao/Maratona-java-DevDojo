package com.daniel.javacore.heranca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    protected String name;
    private String cpf;
    private String cep;

    static {
        System.out.println("Inside Person static block");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String cpf, String cep) {
        this.name = name;
        this.cpf = cpf;
        this.cep = cep;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.cep);
    }
}
