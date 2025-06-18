package com.daniel.aritimeticos;

public class Aula04 {
    public static void main(String[] args) {
        int num = 10;
        int second = 5;

        int result = num * second;

        result = 10 % 5;

        boolean tenIsMoreBig = 10 > 5;

        System.out.println(tenIsMoreBig);

        // && (AND) || (OR) ! (DIFERENTE)

        int age = 31;
        float salary = 3_500f;
        boolean isInLaw = age > 30 && salary > 1_200f;
        System.out.println(isInLaw);

        double currentAccount = 300;
        double amountAccount = 4500;
        float playValue = 4000F;

        boolean isCurrent = currentAccount > playValue || amountAccount > playValue;
        System.out.println(isCurrent);

        double bonus = 100;
        bonus += bonus;
        bonus -= 10;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int counter = 5;
        counter = 0;
        counter++;
        System.out.println(counter);
    }
}
