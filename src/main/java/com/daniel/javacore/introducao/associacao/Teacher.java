package com.daniel.javacore.introducao.associacao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {
    private String username;
    private String speciality;
    private Seminario[] seminarios;

    public Teacher(String username){
        this.username = username;
    }

    public Teacher(String username, String speciality){
        this.username = username;
        this.speciality = speciality;
    }
}
