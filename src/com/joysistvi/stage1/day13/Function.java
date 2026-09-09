package com.joysistvi.stage1.day13;
import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 1st Number");
        int num1 = input.nextInt();
        System.out.println("Enter your 2nd Number");
        int num2 = input.nextInt();

        System.out.println(sum(num1, num2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
