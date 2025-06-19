package com.daniel.javacore.introducao;

import com.daniel.javacore.introducao.domain.Student;
import com.daniel.javacore.introducao.mytests.StudentManager;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.username = "Daniel";
        System.out.println(student.username);
    }
}
