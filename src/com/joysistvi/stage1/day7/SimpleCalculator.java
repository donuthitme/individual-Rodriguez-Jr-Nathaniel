package com.joysistvi.stage1.day7;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter operator");
        char operator = sc.nextLine().charAt(0);

        System.out.println("Enter your second number:");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("Error");
                }
                else {
                    System.out.println("Result " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Error");
        }
        sc.close();
    }
}
