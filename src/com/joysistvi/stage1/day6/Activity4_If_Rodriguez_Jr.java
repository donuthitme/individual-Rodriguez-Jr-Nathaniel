package com.joysistvi.stage1.day6;
import java.util.Scanner;

public class Activity4_If_Rodriguez_Jr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");
        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();

    }
}
