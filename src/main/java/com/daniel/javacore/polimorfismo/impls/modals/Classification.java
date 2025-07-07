package com.daniel.javacore.polimorfismo.impls.modals;

import com.daniel.javacore.polimorfismo.impls.interfaces.Ninja;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Classification implements Ninja {
    private String className = "Jounin";
    protected double life = 150;
    protected double defense = 100;

    public Classification() {
    }

    public Classification(String className) {
        this.className = className;
    }

}
