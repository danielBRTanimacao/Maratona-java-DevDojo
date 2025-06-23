package com.daniel.javacore.introducao.domain;

public class Person {
    protected String name;
    protected int age;
    private String password;
    protected double[] salary;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            System.out.println("Idade não pode ser menor que 0");
            return;
        }
        this.age = newAge;
    }

    public void setPassword(String password) {
        if (this.password.equals(password)) {
            System.out.println("Password não deve ser igual ao anterior!");
            return;
        }
        this.password = password;
    }
}
