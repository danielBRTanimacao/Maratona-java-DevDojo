package com.daniel.javacore.enumEstudo.tests;

import com.daniel.javacore.enumEstudo.tests.enums.TypeCredit;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class CreditCard {
    private TypeCredit credit;
    private double salary;

    public CreditCard(double salary) {
        this.salary = salary;
    }

    public static TypeCredit findByType(String nameRelatory) {
        if (nameRelatory.equals("CREDIT")) {
            return TypeCredit.CREDIT;
        }
        return TypeCredit.DEBIT;
    }

    public void print() {
        System.out.println("Salario atual R$" +  String.format("%.2f", salary));
        System.out.println("Tipo de credito atual " +  TypeCredit.CREDIT);
        System.out.println("Valor do credito atual R$" +  String.format("%.2f", credit.calcCreditValue(salary)));
    }

}
