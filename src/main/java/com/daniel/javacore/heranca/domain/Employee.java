package com.daniel.javacore.heranca.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, String cpf, String adress, double salary) {
        super(name, cpf, adress);
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(salary);
    }

    public void paymentRelatory() {
        System.out.println("Eu " + this.name + " Payment relatory");
    }
}
