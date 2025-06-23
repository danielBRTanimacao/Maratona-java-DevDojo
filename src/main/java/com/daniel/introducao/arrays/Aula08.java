package com.daniel.introducao.arrays;

public class Aula08 {
    public static void main(String[] args) {
        // Arrays dentro de arrays
        // Arrays Multidimensionais

        // dias 1.. 31
        // meses 1.. 12
        // years infinite

        int[][] yearsAndMonths = new int[2][3];

        yearsAndMonths[0][0] = 1;
        yearsAndMonths[0][1] = 2;
        yearsAndMonths[0][2] = 3;
        yearsAndMonths[1][0] = 4;
        yearsAndMonths[1][1] = 5;
        yearsAndMonths[1][2] = 6;


        for (int i = 0; i < yearsAndMonths.length; i++) {
            for (int j = 0; j < yearsAndMonths[i].length; j++) {
                System.out.println(yearsAndMonths[i][j]);
            }
        }

        for (int[] arrbase : yearsAndMonths) {
            for (int num : arrbase) {
                System.out.println(num);
            }
        }

        int[][] arrayInt = new int[2][];

        int[] array = {1, 2, 3};

        arrayInt[0] = new int[4];
        arrayInt[1] = array;
    }
}
