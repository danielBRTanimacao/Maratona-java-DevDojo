package com.daniel.javacore.polimorfismo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer extends Product {
    public static final double TAX_PER_CENT = .21;
    private double memory;

    public Computer(String name, String description, double price, double memory) {
        super(name, description, price);
        this.memory = memory;
    }

    @Override
    public double calcTax() {
        return this.price * TAX_PER_CENT;
    }
}
