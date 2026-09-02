package com.joysistvi.stage1.day11;

public class startsWithMethod {
    public static void main(String[] args) {
        /*
        startsWith()

        Description:
        Checks if a String starts with a specific sequence of characters.
        It returns true or false.

        Syntax:
        string.startsWith(prefix);

        Note: Case-sensitive!
        */


        String text = "Philippines";

        // Example 1 Starts with "Phil"
        System.out.println(text.startsWith("Phil"));

        // Example 2 does not start with "pine"
        System.out.println(text.startsWith("pine"));

        // Example 3 lowercase p
        System.out.println(text.startsWith("phil"));
    }
}
