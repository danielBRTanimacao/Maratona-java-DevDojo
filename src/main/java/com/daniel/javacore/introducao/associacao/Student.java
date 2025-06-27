package com.daniel.javacore.introducao.associacao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private Seminario seminario;
    private String username;
    private int age;

    public Student(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
