package com.daniel.javacore.polimorfismo.impls.modals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hinata extends Classification {
    private final String name = "Hinata";


    @Override
    public void raiseKunay() {
        System.out.println(this.name + " raise kunay");
    }
}
