package com.daniel.javacore.introducao;

import com.daniel.javacore.introducao.domain.Person;
import com.daniel.javacore.introducao.domain.Student;

public class PersonTest {
    public static void main(String[] args) {
        Student cleitinho = new Student("Cleitinho", 13, 'M', "emailtest123@gmail.com");

        cleitinho.getInfos();
    }
}
