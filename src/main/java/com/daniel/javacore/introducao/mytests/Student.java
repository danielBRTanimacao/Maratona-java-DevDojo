package com.daniel.javacore.introducao.mytests;

public class Student extends Person {
    private int id;
    private String roomClass;

    public Student(String username, int age, char gender, String email) {
        super(username, age, gender, email);
        this.id++;
    }

    protected void getInfos() {
        System.out.println("Informações do estudante");
        System.out.println("Identificador " + this.id);
        System.out.println("Sala " + this.roomClass);
        System.out.println("Nome " + this.username);
        System.out.println("Idade " + this.age);
        System.out.println("Genero " + this.gender);
    }

    protected void setClass(String roomClass) {
        this.roomClass = roomClass;
    }
}
