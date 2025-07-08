package com.daniel.javacore.polimorfismo;

import com.daniel.javacore.polimorfismo.domain.Computer;
import com.daniel.javacore.polimorfismo.service.CalcTax;

public class PolimorfismoTeste01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Pc", "Pc do bom", 1456.43, 4);
        CalcTax.calcTaxOnProduct(computer);
    }
}