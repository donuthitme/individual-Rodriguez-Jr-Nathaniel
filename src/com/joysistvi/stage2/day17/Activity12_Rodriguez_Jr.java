package com.joysistvi.stage2.day17;

import java.util.Scanner;


public class Activity12_Rodriguez_Jr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String again = "yes";

        while(again.equalsIgnoreCase("yes")){
            System.out.println("===== ACTIVITY 12 =====");
            System.out.println("1 - Check Odd or Even");
            System.out.println("2 - Print Name 50 Times");
            System.out.println("3 - Get Square Root");
            System.out.println("4 - Get Power");
            System.out.println("5 - Random Number 1-100");
            System.out.println("6 - Area of Circle");
            System.out.println("7 - Check Voter");
            System.out.println("8 - Get Word Length");
            System.out.println("9 - Reverse Word");
            System.out.println("10 - Print Name and Age");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();
                    Activity12_Methods.checkOddEven(number);
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();

                    Activity12_Methods.printName50Times(name);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double squareRootNumber = sc.nextDouble();
                    Activity12_Methods.getSquareRoot(squareRootNumber);
                    break;

                case 4:
                    System.out.print("Enter the base: ");
                    double base = sc.nextDouble();

                    System.out.print("Enter the exponent: ");
                    double exponent = sc.nextDouble();
                    Activity12_Methods.getPower(base, exponent);
                    break;

                case 5:
                    Activity12_Methods.printRandomNumber();
                    break;

                case 6:
                    System.out.print("Enter the radius: ");
                    double radius = sc.nextDouble();
                    Activity12_Methods.getCircleArea(radius);
                    break;

                case 7:
                    System.out.print("Enter your age: ");
                    int age = sc.nextInt();
                    Activity12_Methods.checkVoter(age);
                    break;

                case 8:
                    System.out.print("Enter a word: ");
                    String word = sc.nextLine();
                    Activity12_Methods.getWordLength(word);
                    break;

                case 9:
                    System.out.print("Enter a word: ");
                    String reverseWord = sc.nextLine();
                    Activity12_Methods.printReverse(reverseWord);
                    break;

                case 10:
                    System.out.print("Enter your full name: ");
                    String fullName = sc.nextLine();

                    System.out.print("Enter your age: ");
                    int userAge = sc.nextInt();
                    Activity12_Methods.printNameAndAge(fullName, userAge);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
            sc.nextLine();
            System.out.print("\nDo you want to pick again? (yes/no): ");
            again = sc.nextLine();


        }
        System.out.println("\nProgram ended.");
        sc.close();
    }
}
