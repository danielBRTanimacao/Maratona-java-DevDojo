package com.daniel.javacore.enumEstudo;

import com.daniel.javacore.enumEstudo.tests.CreditCard;
import com.daniel.javacore.enumEstudo.tests.enums.TypeCredit;

public class EnumTeste02 {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1300);
        creditCard.setCredit(TypeCredit.DEBIT);

        creditCard.print();

        CreditCard creditCard2 = new CreditCard(1200);
        creditCard2.setCredit(TypeCredit.CREDIT);

        creditCard2.print();

        System.out.println(CreditCard.findByType("CREDIT"));
    }
}
