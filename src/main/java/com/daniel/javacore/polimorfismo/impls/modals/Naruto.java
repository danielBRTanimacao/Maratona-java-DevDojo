package com.daniel.javacore.polimorfismo.impls.modals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Naruto extends Classification {
    private final String name = "NARUTO";

    public Naruto(){}

    public Naruto(double life, double defense) {
        this.life = life;
        this.defense = defense;
    }

    public Naruto(double life, double defense, String className) {
        super(className);
        this.life = life;
        this.defense = defense;
    }

    @Override
    public void raiseKunay() {
        System.out.println( this.name + " raiseKunay");
    }
}
