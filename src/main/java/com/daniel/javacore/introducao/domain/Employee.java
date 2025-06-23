package com.daniel.javacore.introducao.domain;

import java.util.Arrays;

public class Employee {
    public String name;
    public int age;
    public int ageInit;
    public double[] salary;

    public void printEmployeeInfos() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Salario: " + salary[salary.length - 1]);
    }

    public void salaryBase() {
        if (this.salary == null) return;

        int media = this.salary.length;
        double result = 0;

        for(double salary : this.salary) {
            result += salary;
        }
        System.out.println("Media: R$" + String.format("%.2f", result/media));
    }

    public void printAllSalaries() {
        System.out.println("Salarios: " + Arrays.toString(this.salary));
    }

    public void printYearsInEnterprise() {
        int result = this.age - this.ageInit;
        if (result <= 0) {
            System.out.println("Empregado não chegou a estar 1 ano na empresa!");
        } else {
            System.out.println("Anos totais " + result);
        }
    }
}
