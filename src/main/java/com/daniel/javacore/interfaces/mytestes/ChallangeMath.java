package com.daniel.javacore.interfaces.mytestes;

import com.daniel.javacore.interfaces.mytestes.impls.SuperMath;

public class ChallangeMath {
    public static void main(String[] args) {
        SuperMath superMath = new SuperMath();

        System.out.println(superMath.sum(1.18,2.19));
    }
}
