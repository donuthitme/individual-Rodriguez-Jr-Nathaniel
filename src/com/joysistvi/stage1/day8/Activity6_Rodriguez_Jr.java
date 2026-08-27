package com.joysistvi.stage1.day8;
import java.util.Scanner;

public class Activity6_Rodriguez_Jr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid username or password.");

                if (attempt == 3) {
                    System.out.println("Too many failed attempts. Access denied.");
                } else {
                    System.out.println("Attempts remaining: " + (3 - attempt));
                }
            }
        }

        sc.close();
    }
}
