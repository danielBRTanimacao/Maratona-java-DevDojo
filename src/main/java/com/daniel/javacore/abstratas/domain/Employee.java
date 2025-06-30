package com.daniel.javacore.abstratas.domain;

import lombok.Getter;
import lombok.Setter;

// Esse classe se torna algo completo não pode ser implementada instaciada
// Classe abstratas podem ser extendidas mas não instanciadas
@Getter
@Setter
public abstract class Employee {
    protected String username;
    protected double salary;

    public Employee(String username, double salary) {
        this.username = username;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "Employee [username=" + username + ", salary=" + salary + "]";
    }
}
