package com.daniel.introducao.condicionais;

import java.util.Random;

public class Aula05 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        if (num < 5) {
            System.out.println("Aoba");
        } else {
            System.out.println("Babaui");
        }
        System.out.println(num);

        // boolean logical = num < 18; // posso usar assim e aplicar la
        //String bigAge = num < 18 ? "menor idade" : "Maior idade";
        //System.out.println(bigAge);
        System.out.println(bigAge(num));
        byte nday = 5;
        actualDay(nday);
    }

    public static String bigAge(int age) {
        return age < 18 ? "Menor" : "Maior";
    }

    public static void actualDay(byte day) {
        switch (day) {
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sabado");
            default:
                System.out.println("Opção invalida!");
        }
    }

}
