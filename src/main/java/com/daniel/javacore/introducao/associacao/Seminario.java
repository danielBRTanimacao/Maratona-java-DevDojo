package com.daniel.javacore.introducao.associacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seminario {
    private Student[] students;
    private Teacher teacher;
    private String title;
    private Local local;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Local local) {
        this.title = title;
    }
}
