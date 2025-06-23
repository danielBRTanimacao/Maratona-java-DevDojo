package com.daniel.javacore.introducao.domain;

import javax.naming.directory.InvalidAttributesException;
import java.util.Arrays;
import java.util.Optional;

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

    public double elevateNum(double num1, double num2) throws InvalidAttributesException {
        if(num2 < 0){
            throw new InvalidAttributesException("Digite um valor maior que 0");
        }
        double result = num1;
        for(int i = 1; i < num2; i++) {
            result *= 10;
        }
        return result;
    }

    public String convertNumberTo(
            double num,
            String actual,
            String toConvert,
            int elevateLvl
    ) throws InvalidAttributesException {
        // mm, cm, dm, m, dam, hem, km
        // < 10x :10 >

        String[] conversos = {"mm", "cm", "dm", "m", "dam", "hem", "km"};

        int multiTen = (int) this.elevateNum(10, elevateLvl);

        int positionActual = 0;
        int positionToConvert = 0;
        for(int i = 0; i < conversos.length; i++) {
            if(conversos[i].equals(actual)) {
                positionActual = i;
            }
            if(conversos[i].equals(toConvert)) {
                positionToConvert = i;
            }
        }

        if(positionActual < positionToConvert){
            for (int i = positionActual+1; i < positionToConvert; i++) {
                multiTen /= multiTen;
            }
        } else {
            for (int i = positionToConvert+1; i < positionActual; i++) {
                multiTen *= multiTen;
            }
        }

        return multiTen * num + toConvert + elevateLvl;
    }

    public String changeValues(int num1, int num2) {
        num1 = 99;
        num2 = 89;
        return num1 + " " + num2;
    }

    // Var args precisa ser o ultimo valor
    public int sumVarArgs(int... numbers) {
        int total = 0;
        for (int num: numbers) {
            total += num;
        }
        return total;
    }

}
