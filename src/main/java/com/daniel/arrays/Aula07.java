package com.daniel.arrays;

public class Aula07 {
    public static void main(String[] args) {
        //int[] ages = null; // Tipo de referencia nulo
        int[] ages = new int[3]; // Esta guardando 3 espaços na memoria se printado retorna uma referencia de memoria

        ages[0] = 17;
        ages[1] = 23; // Arrays considerados objetos
        ages[2] = 31;

        System.out.println(ages[0]);
        // byte, short, int, long, float e double = 0
        // char '\u0000'
        // boolean = false
        // string = null

        String[] personas = new String[3]; // Tipo reference objetos possui funções a mais
        personas[0] = "Naruto";
        personas[1] = "Goku";
        personas[2] = "Jhonny";

        /* Outra forma de fazer for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }*/

        for (String persona : personas) {
            System.out.println(persona);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // forma para economizar
        // int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10}; // Outra forma de inicializar

        for (int count = 1; count <= numbers.length; count++) {
            System.out.println(numbers[0]);
        }

        for (int i : numbers) { // Não e possivel acessar index especifico uma versão simplificada
            System.out.println(i);
        }

    }
}
