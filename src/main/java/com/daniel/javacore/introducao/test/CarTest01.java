package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car impala = new Car();
        impala.setName("Impala");
        System.out.println(impala.getName());

        Car Volkswagen = new Car();
        Volkswagen.setName("Volkswagen");
        System.out.println(Volkswagen.getName());
    }
}
