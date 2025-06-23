package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Person;

public class PersonTest01 {
    public static void main(String... args) {
        Person p = new Person("Daniel", 21, "123");
        System.out.println(p.getAge());
        p.setAge(-10);
    }
}
