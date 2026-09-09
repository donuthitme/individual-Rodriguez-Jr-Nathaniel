package com.joysistvi.stage1.day14;

public class Scope {
    public static void main(String[] args) {
        System.out.println(name);
        printName();
        printAge();

        int x = 10;

        if (true) {
            double balance = 100.0;
            System.out.println(balance);
        }
    }

    static String name = "Nathan";

    public static void printName() {
        System.out.println(name);
    }

    static int age = 30;

    public static void printAge() {
        System.out.println(age);
    }

}
