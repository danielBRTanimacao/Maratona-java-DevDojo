package com.daniel.javacore.polimorfismo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tomato extends Product{
    private String validateDate;
    public static final double TAX_PER_CENT = .8;

    public Tomato(String name, String description, double price, String validateDate) {
        super(name, description, price);
        this.validateDate = validateDate;
    }

    @Override
    public double calcTax() {
        return this.getPrice() * TAX_PER_CENT;
    }

}
