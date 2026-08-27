package com.joysistvi.stage1.day8;
import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = "bruh@gmail.com";
        String password = "password123.";

        System.out.println("Enter your email: ");
        String loginEmail = sc.nextLine();

        System.out.println("Enter your password: ");
        String loginPassword = sc.nextLine();

        if (loginEmail.equals(email) && loginPassword.equals(password)) {
            System.out.println("Login Successful");
        } else  {
            System.out.println("Login Failed");
        }
    }
}
