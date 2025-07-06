package com.daniel.javacore.polimorfismo.service;

import com.daniel.javacore.polimorfismo.domain.Computer;
import com.daniel.javacore.polimorfismo.domain.Product;

public class CalcTax {
    public static void calcTaxOnProduct(Computer computer, String productName) {
        System.out.println("A taxa e R$" + String.format("%.2f", computer.calcTax()));
        System.out.println("Valor do " + productName + " R$"  + String.format("%.2f", computer.getPrice()));
        System.out.println("Valor mais o imposto R$" + String.format("%.2f", computer.calcTax() + computer.getPrice()));
    }

    public static void calcTaxOnProduct(Product product) {
        System.out.println("Relatorio de imposto!");
        double tax = product.calcTax();
        System.out.println("Product: " + product.getName());
    }
}
