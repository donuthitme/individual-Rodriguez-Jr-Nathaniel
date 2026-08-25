package com.joysistvi.stage1.day6;
import java.util.Scanner;

public class Activity4_Switch_Rodriguez_Jr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1: View Grades");
                break;

            case 2:
                System.out.println("You selected Option 2: Enroll Subjects");
                break;

            case 3:
                System.out.println("You selected Option 3: Pay Tuition");
                break;

            case 4:
                System.out.println("You selected Option 4: Exit");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }
}
