package com.joysistvi.stage1.day10;
import java.util.Scanner;

public class Activity8_Rodriguez_Jr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5 numbers
        int[] numbers = new int[5];

        // loop to enter 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Display
        System.out.println("\nNumbers entered:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }

        // Calculation
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        // Find highest and lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        sc.close();
    }
}
