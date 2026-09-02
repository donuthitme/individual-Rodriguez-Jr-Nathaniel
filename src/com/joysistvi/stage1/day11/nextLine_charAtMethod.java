package com.joysistvi.stage1.day11;
import java.util.Scanner;

public class nextLine_charAtMethod {
    public static void main(String[] args) {
        /*
        nextLine().charAt()

        Description:
        nextLine() reads an entire line of input.
        charAt() gets a character at a specific index.
        If combined it reads the input and get the character at a chosen position.

        Syntax:
        scanner.nextLine().charAt(index);

        Note: Index starts at 0. If the input is too short, it will cause an error!
        */

        Scanner sc = new Scanner(System.in);

        // Example 1 Get the first character
        System.out.print("Enter a letter: ");
        char letter = sc.nextLine().charAt(0);
        System.out.println("You entered: " + letter);
        System.out.println();

        // Example 2 Get the second character (index 1)
        System.out.print("Enter a word: ");
        char secondChar = sc.nextLine().charAt(1);
        System.out.println("The second character is: " + secondChar);
        System.out.println();

        // Example 3 What if index is too high?
        System.out.print("Enter 'Hi': ");
        char error = sc.nextLine().charAt(2);
        System.out.println(error);
    }
}
