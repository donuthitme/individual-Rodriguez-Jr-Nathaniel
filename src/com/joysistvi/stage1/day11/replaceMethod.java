package com.joysistvi.stage1.day11;

public class replaceMethod {
    public static void main(String[] args) {
        /*
        replace()

        Description:
        Replaces a character or sequence of characters with another value.

        Syntax:
        string.replace(oldValue, newValue);

        Note: Replaces ALL occurrences. Case-sensitive!
        */

        String text = "Hello World";

        // Example 1 Replace a word
        System.out.println(text.replace("World", "Java"));

        // Example 2 Replace a single character (all occurrences)
        System.out.println(text.replace("l", "x"));

        // Example 3 no replacement happens because it's case sensitive
        System.out.println(text.replace("world", "Java"));
    }
}
