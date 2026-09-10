package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stud = new Student(1, "Winter R", 26, "BSCPE", "Molave", "Malabon City");

        System.out.println("\nStudent Profile");
        System.out.println("Name: " + stud.getName());
        System.out.println("Age: " + stud.getAge());
        System.out.println("Course: " + stud.getCourse());
        System.out.println("Section: " + stud.getSection());
        System.out.println("Address: " + stud.getAddress());
    }
}
