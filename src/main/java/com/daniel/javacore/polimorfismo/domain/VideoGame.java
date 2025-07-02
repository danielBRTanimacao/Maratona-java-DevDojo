package com.daniel.javacore.polimorfismo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoGame extends Product {
    private String gen;
    private boolean blocked = false;

    public VideoGame(String name, String description, double price) {
        super(name, description, price);
        this.gen = "5";
    }

    public VideoGame(String name, String description, double price, String gen) {
        super(name, description, price);
        this.gen = gen;
    }

    @Override
    public double calcTax() {
        return this.price * .05;
    }
}
