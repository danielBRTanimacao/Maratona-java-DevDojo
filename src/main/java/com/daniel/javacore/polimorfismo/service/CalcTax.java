package com.daniel.javacore.polimorfismo.service;

import com.daniel.javacore.polimorfismo.domain.Computer;
import com.daniel.javacore.polimorfismo.domain.Product;
import com.daniel.javacore.polimorfismo.domain.Tomato;

public class CalcTax {
    public static void calcTaxOnProduct(Product product) {
        System.out.println("A taxa e R$" + String.format("%.2f", product.calcTax()));
        System.out.println("Valor do " + product.getName() + " R$"  + String.format("%.2f", product.getPrice()));
        System.out.println("Valor mais o imposto R$" + String.format("%.2f", product.calcTax() + product.getPrice()));
        // Utilizando Cast e instanceOf
        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println("Data de validade " + tomato.getValidateDate());
        } else if (product instanceof Computer) {
            double memory = ((Computer) product).getMemory();
            System.out.println("Capacidade de memoria " + memory);
        }
    }

}
