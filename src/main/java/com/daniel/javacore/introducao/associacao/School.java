package com.daniel.javacore.introducao.associacao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        if (this.professors != null) {
            for (Professor professor : this.professors) {
                System.out.println(professor.getName());
            }
        }
    }
}
