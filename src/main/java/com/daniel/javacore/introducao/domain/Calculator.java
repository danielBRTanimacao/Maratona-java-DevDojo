package com.daniel.javacore.introducao.domain;

import javax.naming.directory.InvalidAttributesException;

public class Calculator {
    public double sum(double num1, double num2) throws InvalidAttributesException {
        if(num1 < 0 || num2 < 0){
            throw new InvalidAttributesException("Atributo não pode ser negativo!");
        }
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        if(num2 < 0){
            return num1 + num2;
        }
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double square(double num) {
        return num * num;
    }

    public int findsqr(int num1) throws InvalidAttributesException {
        if (num1 < 0) {
            throw new InvalidAttributesException("Impossible de sqrt!");
        }
        return num1;
    }
}
