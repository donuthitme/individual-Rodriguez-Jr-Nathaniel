package com.joysistvi.stage1.day11;
import  java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
//        int[][] numbers = {
//            //   1 2 3
//                {1,2,3}, // 1
//                {4,5,6}, // 2
//                {7,8,9}  // 3
//        };
//
////        System.out.println(numbers.length);
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println(numbers[i][j]);
//            }
//            System.out.println();
//        }
        Scanner scanner = new Scanner(System.in);

        String[][] planets = new String[2][4];

        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.print("Enter planet[" + i + "][" + j + "]: ");
                planets[i][j] = scanner.nextLine();
            }
        }

        // [Section] Enhanced Nested For Loop / For Each Loop
        System.out.println("\nPrinting all the planets:");
        for (String[] rows : planets) {
            for (String column : rows) {
                System.out.println(column);
            }
            System.out.println();
        }
    }
}
