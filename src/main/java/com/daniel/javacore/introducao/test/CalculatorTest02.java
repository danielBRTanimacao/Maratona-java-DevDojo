package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Calculator;

public class CalculatorTest02 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 1;
        int num2 = 2;

        System.out.println(calc.changeValues(num1, num2));
        // System.out.println(calc.square(2.5));
    }
}
