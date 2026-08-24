package com.joysistvi.stage1.day5;

public class Activity3_Rodriguez_Jr {
    public static void main(String[] args) {

        //Using the logical AND operator (&&), determine if the person is allowed to enter an event.
        int age = 23;
        boolean hasValidID = true;
        System.out.println("-----1st Activity-----");

        if (age >= 18 && hasValidID) {
            System.out.println("You are allowed to enter.");
        }
        else {
            System.out.println("You are not allowed to enter.");
        }

        //Using the logical OR operator (||), determine if there are no classes today.
        boolean isWeekend = false;
        boolean isHoliday = false;
        System.out.println("-----2nd Activity-----");

        if (isWeekend || isHoliday) {
            System.out.println("No classes today.");
        }
        else {
            System.out.println("Have classes today.");
        }

        //Use the ternary operator (? :) to determine if the student passed or failed.
        int score = 81;
        System.out.println("-----3rd Activity-----");

        String result = score >= 75 ? "Passed" : "Failed";
        System.out.println("Score of your exam is: " + result);

        //Use the ternary operator (? :) to determine the larger number.
        int number1 = 10;
        int number2 = 90;
        System.out.println("-----4th Activity-----");

        String higherNumber = number1 >= number2 ? number1 + " is greater than " + number2 : number2 + " is greater than  " + number1;
        System.out.println("The number " + higherNumber);
    }
}
