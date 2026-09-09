package com.joysistvi.stage1.day12;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== EXAM SCORE ANALYZER =====");

        System.out.print("Enter Score 1: ");
        int score1 = sc.nextInt();

        System.out.print("Enter Score 2: ");
        int score2 = sc.nextInt();

        int highest = Math.max(score1, score2);
        int lowest = Math.min(score1, score2);

        System.out.println("\n--- RESULTS ---");
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

        sc.close();
    }
}
