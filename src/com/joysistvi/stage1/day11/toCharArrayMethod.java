package com.joysistvi.stage1.day11;

public class toCharArrayMethod {
    public static void main(String[] args) {
        /*
        toCharArray()

        Description:
        Converts a String into an array of characters.

        Syntax:
        string.toCharArray();

        Note: Each character becomes one element in the array. Index starts at 0.
        */

        String text = "Java";
        char[] letters = text.toCharArray();

        // Example 1 Get first character (index 0)
        System.out.println(letters[0]);

        // Check 3: Get last character (index 3)
        System.out.println(letters[3]);

        // Check 4: Get the length of the array
        System.out.println(letters.length);
    }
}
