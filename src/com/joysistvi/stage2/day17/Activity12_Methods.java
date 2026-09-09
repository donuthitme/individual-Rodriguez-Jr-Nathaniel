package com.joysistvi.stage2.day17;

public class Activity12_Methods {
    // 1. Method to identify if a number is odd or even
    public static void checkOddEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }


    // 2. Method to print a name 50 times
    public static void printName50Times(String name) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + name);
        }
    }


    // 3. Method to get the square root of a number
    public static void getSquareRoot(double number) {

        double result = Math.sqrt(number);

        System.out.println("Square root of " + number + ": " + result);
    }


    // 4. Method to get the power using base and exponent
    public static void getPower(double base, double exponent) {

        double result = Math.pow(base, exponent);

        System.out.println(
                base + " raised to the power of "
                        + exponent + ": " + result
        );
    }


    // 5. Method to print a random number between 1 and 100
    public static void printRandomNumber() {

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Random number: " + randomNumber);
    }


    // 6. Method to get the area of a circle
    public static void getCircleArea(double radius) {

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Radius: " + radius);
        System.out.println("Area of circle: " + area);
    }


    // 7. Method to identify if a person is a voter or not
    public static void checkVoter(int age) {

        if (age >= 18) {
            System.out.println("Age: " + age);
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("Age: " + age);
            System.out.println("The person is not eligible to vote.");
        }
    }


    // 8. Method to get the length of a word
    public static void getWordLength(String word) {

        int length = word.length();

        System.out.println("Word: " + word);
        System.out.println("Length: " + length);
    }


    // 9. Method to print a word in reverse order
    public static void printReverse(String word) {

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }


    // 10. Method to print full name and age
    public static void printNameAndAge(String fullName, int age) {

        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }
}
