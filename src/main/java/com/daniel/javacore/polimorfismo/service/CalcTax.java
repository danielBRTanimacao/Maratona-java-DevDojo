package com.daniel.javacore.polimorfismo.service;

import com.daniel.javacore.polimorfismo.domain.Computer;

public class CalcTax {
    public static void calcTaxOnProduct(Computer computer, String productName) {
        System.out.println("A taxa e R$" + String.format("%.2f", computer.calcTax()));
        System.out.println("Valor do " + productName + " R$"  + String.format("%.2f", computer.getPrice()));
        System.out.println("Valor mais o imposto R$" + String.format("%.2f", computer.calcTax() + computer.getPrice()));
    }
}
