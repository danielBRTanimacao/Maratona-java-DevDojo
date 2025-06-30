package com.daniel.javacore.enumEstudo.tests.enums;

import java.util.Random;

public enum TypeCredit {
    CREDIT("Credito"){
        @Override
        public double calcCreditValue(double credit) {
            return credit * .5 + credit;
        }
    },
    DEBIT("Debito"){
        @Override
        public double calcCreditValue(double credit) {
            return credit / 2 + (credit / 4);
        }
    };

    private final String nameRelatory;

    TypeCredit(String nameRelatory) {
        this.nameRelatory = nameRelatory;
    }

    //  private final int ID;

    /*{ // Fazendo apenas um teste
        Random random = new Random();
        this.ID = random.nextInt(100);
    }*/

    public double calcCreditValue(double salary) {
        return 0;
    }

    public String getNameRelatory() {
        return this.nameRelatory;
    }

    /*public int getId() {
        return this.ID;
    }*/

    public static TypeCredit getTypeCredit() {
        for (TypeCredit typeCredit : TypeCredit.values()) {
            if (typeCredit.nameRelatory.equals(typeCredit.getNameRelatory())) {
                return typeCredit;
            }
        }
        return null;
    }
}
