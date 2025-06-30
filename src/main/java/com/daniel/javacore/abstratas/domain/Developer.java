package com.daniel.javacore.abstratas.domain;

public class Developer extends Employee {
    private String stack;

    public Developer(String username, double salary) {
        super(username, salary);
    }

    @Override
    public void updateSalary() {
        this.salary += this.salary * .15;
    }

}
