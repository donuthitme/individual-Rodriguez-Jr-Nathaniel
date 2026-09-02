package com.joysistvi.stage1.day11;
import java.util.Scanner;
public class Activity9_Rodriguez_Jr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for number of students and subjects
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        sc.nextLine();

        // Store subject names
        String[] subjects = new String[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }

        // Store student names, grades, and averages
        String[] studentNames = new String[numberOfStudents];
        double[][] grades = new double[numberOfStudents][numberOfSubjects];
        double[] averages = new double[numberOfStudents];

        // Get student information and grades
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.print("\nEnter student name: ");
            studentNames[i] = sc.nextLine();

            double total = 0;

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter grade for " + subjects[j] + ": ");
                grades[i][j] = sc.nextDouble();

                total += grades[i][j];
            }

            averages[i] = total / numberOfSubjects;
            sc.nextLine();
        }

        // Display Grades Report
        System.out.println("\n========== GRADES REPORT ==========");

        System.out.printf("%-20s", "Student Name");

        for (String subject : subjects) {
            System.out.printf("%-15s", subject);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.printf("%-20s", studentNames[i]);

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.printf("%-15.2f", grades[i][j]);
            }

            System.out.printf("%.2f%n", averages[i]);
        }

        sc.close();
    }
}
