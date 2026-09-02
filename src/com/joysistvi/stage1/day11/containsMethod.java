package com.joysistvi.stage1.day11;

public class containsMethod {
    public static void main(String[] args) {
        /*
        contains()

        Description:
        Checks if a String contains a specific sequence of characters.
        It returns true if the sequence is found, otherwise false.

        Syntax:
        string.contains(sequence);

        Note: it is case-sensitive.
        */

        String text = "Philippines";
        // Example 1
        System.out.println(text.contains("Phil"));
        //Example 2
        System.out.println(text.contains("phil"));
    }
}
