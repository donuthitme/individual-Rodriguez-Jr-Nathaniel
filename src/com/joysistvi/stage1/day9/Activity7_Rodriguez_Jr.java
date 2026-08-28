package com.joysistvi.stage1.day9;
import java.util.Scanner;

public class Activity7_Rodriguez_Jr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter multiplication table: ");
        int number = sc.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }

        sc.close();
    }
}
