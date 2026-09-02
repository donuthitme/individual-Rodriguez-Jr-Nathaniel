package com.joysistvi.stage1.day11;

public class trimMethod {
    public static void main(String[] args) {
        /*
        trim()

        Description:
        Removes spaces from the beginning and end of a String.

        Syntax:
        string.trim();

        Note: Removes only leading and trailing spaces, not spaces in the middle
        */

        String name = "   Nathan   ";

        // Check 1: Before trimming
        System.out.println("Before trim: " + name);

        // Check 2: After trimming
        System.out.println("After trim: " + name.trim());

        // Check 3: Spaces in the middle are not removed
        String fullName = "   Nathaniel   Dela   Cruz   Rodriguez   Jr";
        System.out.println("Middle spaces stay: " + fullName.trim());
    }
}
