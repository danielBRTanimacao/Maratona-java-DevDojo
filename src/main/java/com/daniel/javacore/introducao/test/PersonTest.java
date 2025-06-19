package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Student;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.username = "Daniel";
        System.out.println(student.username);
    }
}
