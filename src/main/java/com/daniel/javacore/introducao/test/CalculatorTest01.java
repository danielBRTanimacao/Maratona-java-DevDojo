package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Calculator;

import javax.naming.directory.InvalidAttributesException;

public class CalculatorTest01 {
    public static void main(String[] args) throws InvalidAttributesException {
        Calculator calculator = new Calculator();
        double result = calculator.sum(1.21, 3.59);
        System.out.println(result);

        double result2 = calculator.sub(2, 3);
        System.out.println(result2);

        double result3 = calculator.multiply(2, 3);
        System.out.println(result3);

        double result4 = calculator.divide(6, 3);
        System.out.println(result4);

        double result5 = calculator.square(5);
        System.out.println(result5);

        System.out.println(calculator.convertNumberTo(2, "m", "cm", 1));

        double result6 = calculator.elevateNum(10, 2);
        System.out.println(result6);

    }
}
