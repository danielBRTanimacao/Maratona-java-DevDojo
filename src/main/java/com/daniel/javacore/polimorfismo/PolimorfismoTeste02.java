package com.daniel.javacore.polimorfismo;

import com.daniel.javacore.polimorfismo.domain.Computer;
import com.daniel.javacore.polimorfismo.domain.Product;
import com.daniel.javacore.polimorfismo.domain.VideoGame;
import com.daniel.javacore.polimorfismo.service.CalcTax;

public class PolimorfismoTeste02 {
    public static void main(String[] args) {
        // Iniciando com a super instanciando a implementação
        Product product = new Computer("Samsung Book", "Top", 2700, 4);

        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.calcTax());
        System.out.println(product.calcTax() + product.getPrice());

        Product product2 = new VideoGame("Prey 5", "Top", 4500);
        System.out.println(product2.getName());
        System.out.println(product2.getDescription());
        System.out.println(product2.calcTax());
        // atualizar aqui sobre System.out.println(product2.getBlocked());
        System.out.println(product2.calcTax() + product2.getPrice());

        CalcTax.calcTaxOnProduct(product2);
    }
}
