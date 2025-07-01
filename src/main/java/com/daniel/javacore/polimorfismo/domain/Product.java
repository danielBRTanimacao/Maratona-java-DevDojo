package com.daniel.javacore.polimorfismo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product implements TaxService {
    protected String name;
    protected String description;
    protected double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
