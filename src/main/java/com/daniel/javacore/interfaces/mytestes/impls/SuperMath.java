package com.daniel.javacore.interfaces.mytestes.impls;

import com.daniel.javacore.interfaces.mytestes.interfaces.BasicMath;

public class SuperMath implements BasicMath {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double square(double a) {
        return a * a;
    }
}
