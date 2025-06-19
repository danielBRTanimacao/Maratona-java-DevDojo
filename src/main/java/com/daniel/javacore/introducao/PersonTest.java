package com.daniel.javacore.introducao;

import com.daniel.javacore.introducao.mytests.Student;
import com.daniel.javacore.introducao.mytests.StudentManager;

public class PersonTest {
    public static void main(String[] args) {
        Student cleitin = new Student("Cleitin", 14, 'M', "email123@gmail.com");
        StudentManager gerente = new StudentManager(cleitin);

        gerente.setStudentClass(1);
    }
}
