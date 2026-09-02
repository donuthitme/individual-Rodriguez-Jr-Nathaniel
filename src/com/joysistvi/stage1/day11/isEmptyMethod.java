package com.joysistvi.stage1.day11;

public class isEmptyMethod {
    public static void main(String[] args) {
        /*
        isEmpty()

        Description:
        Checks whether a String contains zero characters.
        Returns true if the String is empty (length = 0).

        Syntax:
        string.isEmpty();

        Note: A space " " is NOT empty. It has 1 character!
        */

        //Example 1 zero characters
        String ex1 = "";
        System.out.println(ex1.isEmpty());
        //Example 2 false because it has characters
        String ex2 = "Philippines";
        System.out.println(ex2.isEmpty());
        //Example 3 false because it has characters
        String ex3 = " ";
        System.out.println(ex3.isEmpty());
    }
}
