package com.daniel.javacore.abstratas;

import com.daniel.javacore.abstratas.domain.Developer;
import com.daniel.javacore.abstratas.domain.Manager;

public class AbstractTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 6600);
        Developer developer = new Developer("Chopper", 8000);
        System.out.println(manager);
        System.out.println(developer);
        developer.print();
    }
}
