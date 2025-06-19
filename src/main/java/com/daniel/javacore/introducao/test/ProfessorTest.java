package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setUsername("Daniel");
        System.out.println(professor.getUsername());
    }
}
