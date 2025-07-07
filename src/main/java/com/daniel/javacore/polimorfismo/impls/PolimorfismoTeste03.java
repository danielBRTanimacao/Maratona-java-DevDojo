package com.daniel.javacore.polimorfismo.impls;

import com.daniel.javacore.polimorfismo.impls.modals.Hinata;
import com.daniel.javacore.polimorfismo.impls.modals.Naruto;
import com.daniel.javacore.polimorfismo.impls.service.AttackService;

public class PolimorfismoTeste03 {
    public static void main(String[] args) {
        AttackService.ninjaMakeAttack(new Naruto());
        AttackService.ninjaMakeAttack(new Hinata());
    }
}
