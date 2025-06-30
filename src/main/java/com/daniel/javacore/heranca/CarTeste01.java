package com.daniel.javacore.heranca;

import com.daniel.javacore.heranca.domain.Buyer;
import com.daniel.javacore.heranca.domain.Car;
import com.daniel.javacore.heranca.domain.Subaru;

public class CarTeste01 {
    public static void main(String[] args) {
        Car car = new Car("D20");
        Buyer buyer = new Buyer();
        buyer.setName("Bababui");

        System.out.println(car.VELOCITY_LIMIT);
        // Não e possivel associar valor por ser final
        car.BUYER.setName(buyer.getName());
        System.out.println(car.BUYER.getName());

        // RECOMENDAÇÃO SINGLETON PATTERN

        Subaru subaru = new Subaru("Impenza");
        subaru.print();
    }
}
