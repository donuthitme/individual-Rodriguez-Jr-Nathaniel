package com.joysistvi.stage1.day11;

public class valueOfMethod {
    public static void main(String[] args) {
        /*
        valueOf()

         Description:
         Converts another data type such as int, double, boolean,
         or char into a String.

         Syntax:
         String.valueOf(value);
        */

        int age = 22;
        double price = 99.99;
        boolean isPassed = true;
        char grade = 'A';

        // Example 1 Convert int to String
        String ageText = String.valueOf(age);
        System.out.println("Int to String: " + ageText);

        // Example 2 Convert double to String
        String priceText = String.valueOf(price);
        System.out.println("Double to String: " + priceText);

        // Example 3 Convert boolean to String
        String resultText = String.valueOf(isPassed);
        System.out.println("Boolean to String: " + resultText);

        // Example 4 Convert char to String
        String gradeText = String.valueOf(grade);
        System.out.println("Char to String: " + gradeText);
    }
}
