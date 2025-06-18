package com.daniel.introducao.loops;

public class Aula06 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count++);
        }

        do {
            System.out.println(count++);
        } while (count < 10);

        for (int i = 0; i <= count; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= count; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        int division = 5;
        float itemValue = 145.2f;
        for (int i = 0; i <= division; i++) {
            if (i == 0) continue;
            System.out.printf("%.2f%n", itemValue / i);
        }
    }
}
