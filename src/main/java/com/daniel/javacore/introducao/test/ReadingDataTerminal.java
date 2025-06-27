package com.daniel.javacore.introducao.test;

import java.util.Scanner;

public class ReadingDataTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String word = scanner.next();  apenas o primeiro String
        String word = scanner.nextLine();
        System.out.println(word);
        scanner.close();
    }
}
