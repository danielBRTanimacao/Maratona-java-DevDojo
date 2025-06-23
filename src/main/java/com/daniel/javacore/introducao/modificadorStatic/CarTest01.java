package com.daniel.javacore.introducao.modificadorStatic;

public class CarTest01 {
    public static void main(String[] args) {
        Car camaro = new Car("Camaro", 140);
        camaro.setMaxAcceleration(290);
        camaro.print();

        Car.maxAcceleration = 190;

        camaro.print();
    }
}
