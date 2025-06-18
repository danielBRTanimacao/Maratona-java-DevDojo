package com.daniel.javacore.introducao.domain;

import java.util.Random;

public class Student extends StudentSystem {
    private int id;
    private String roomClass;

    public Student(String username, int age, char gender, String email) {
        super(username, age, gender, email);
        this.id++;
    }

    public void getInfos() {
        System.out.println("Informações do estudante");
        System.out.println("Identificador " + this.id);
        System.out.println("Nome " + this.username);
        System.out.println("Idade " + this.age);
        System.out.println("Genero " + this.gender);
    }
}
