package com.daniel.javacore.introducao.mytests;

public class StudentSystem extends Person{
    private String[] roomClass = {"A", "B", "C", "D"};

    public StudentSystem(String username, int age, char gender, String email) {
        super(username, age, gender, email);
    }
}
