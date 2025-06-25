package com.daniel.javacore.introducao.modificadorStatic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String name;
    private int maxVelocity;
    public static int maxAcceleration = 250;

    static  {
        System.out.println("Inside Car constructor");
    }

    public Car(String name, int velocity) {
        this.name = name;
        this.maxVelocity = velocity;
    }

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade maxima: " + this.maxVelocity + "Km/h");
        System.out.println("Velocidade limite: " + Car.maxAcceleration + "Km/h");
    }

    public void setMaxAcceleration(int maxAcceleration) {
        Car.maxAcceleration = maxAcceleration;
    }

}
