package com.daniel.challanges;

import java.util.Arrays;
import java.util.Scanner;

public class Challange02 {

    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("Caça palavras");
        System.out.println("==============");

        String zaWarudo = "Mundo"; // a palavra correta
        char[] breakedString = breakString(zaWarudo); // para salvar as que acertou

        String chose = choseWord().strip(); // palavra digitada pelo user

        isCorrect(breakedString, chose);

        System.out.println(Arrays.toString(breakedString));
    }

    public static char[] breakString(String word) {
        return word.toCharArray();
    }

    public static String choseWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e a palavra?");
        String word = scanner.next();
        scanner.close();
        return word;
    }

    public static void isCorrect(char[] word, String digited) {
        char[] breakDigited = breakString(digited);
        for (int i = 0; i < word.length; i++) {
            if (word[i] == breakDigited[i]) {
                System.out.println(word[i]);
            }
        }
        System.out.println("Achou");
    }
}