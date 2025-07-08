package com.daniel.javacore.polimorfismo;

import com.daniel.javacore.polimorfismo.domain.Computer;
import com.daniel.javacore.polimorfismo.domain.Product;
import com.daniel.javacore.polimorfismo.domain.Tomato;
import com.daniel.javacore.polimorfismo.service.CalcTax;

public class PolimorfismoTeste03 {
    public static void main(String[] args) {
        Product product = new Computer("PC", "Pc potente", 2400, 16);
        Tomato tomato = new Tomato("American", "Tomate bom", 2, "01/01/2025");

        CalcTax.calcTaxOnProduct(tomato);
        CalcTax.calcTaxOnProduct(product);
    }
}
