package com.daniel.javacore.abstratas.domain;

import lombok.Getter;
import lombok.Setter;

// Esse classe se torna algo completo não pode ser implementada instaciada
// Classe abstratas podem ser extendidas mas não instanciadas
@Getter
@Setter
public abstract class Employee extends Person {
    protected String username;
    protected double salary;

    public Employee(String username, double salary) {
        this.username = username;
        this.salary = salary;
        this.updateSalary();
    }

    @Override
    public String toString() {
        return  "Employee [username=" + username + ", salary=" + salary + "]";
    }

    @Override
    public void print() {
        System.out.print("Implementação concreta!");
    }

    // E possivel ter metodos abstratos e não abstratos em 'abstract class' porem
    // em  classes concretas não e possivel
    abstract public void updateSalary();
}
