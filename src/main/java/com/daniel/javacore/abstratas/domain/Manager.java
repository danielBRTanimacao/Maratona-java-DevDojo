package com.daniel.javacore.abstratas.domain;

public class Manager extends Employee {
    public Manager(String username, int salary) {
        super(username, salary);
    }

    @Override
    public void updateSalary() {
        this.salary += this.salary * .25;
    }

}
