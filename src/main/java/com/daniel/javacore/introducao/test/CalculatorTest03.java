package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(calculator.sumVarArgs(nums));
        System.out.println(calculator.sumVarArgs(new int[] {1, 2, 3}));
        System.out.println(calculator.sumVarArgs(3, 3, 3)); // identifica como array
    }
}
