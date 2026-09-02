package com.joysistvi.stage1.day11;

public class indexOfMethod {
    public static void main(String[] args) {
        /*
        indexOf()

        Description:
        Finds the position or index of a character or String.
        Java indexes start at 0.
        If the value is not found, it returns -1.

        Syntax:
        string.indexOf(value);

        Note: It is case-sensitive and returns only the first occurrence.
        */

        String text = "Philippines";
        //Example 1
        System.out.println(text.indexOf("i"));
        //Example 2
        System.out.println(text.indexOf("p"));
        //Example 3
        System.out.println(text.indexOf("z"));
    }
}
