package com.joysistvi.stage1.day11;

public class endsWithMethod {
    public static void main(String[] args) {
        /*
        endsWith()

        Description:
        Checks if a String ends with a specific sequence of characters.
        Returns true if it ends with the suffix, otherwise false.

        Syntax:
        string.endsWith(suffix);

        Note: It is case-sensitive!
        */

        String text = "Philippines";
        //Example 1 (True because it ends with s)
        System.out.println(text.endsWith("ines"));
        //Example 2 (False because does not end with "pine")
        System.out.println(text.endsWith("pine"));
        //Example 3 (False because of Capital "I")
        System.out.println(text.endsWith("Ines"));
    }
}
