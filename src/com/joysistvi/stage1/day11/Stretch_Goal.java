package com.joysistvi.stage1.day11;

public class Stretch_Goal {
    public static void main(String[] args) {

        String country = "Philippines";

        // Display first character
        char firstCharacter = country.charAt(0);

        // Display last character
        char lastCharacter = country.charAt(country.length() - 1);

        System.out.println("Country: " + country);
        System.out.println("First character: " + firstCharacter);
        System.out.println("Last character: " + lastCharacter);


        // Count how many times P or p appears
        int pCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char character = country.charAt(i);

            if (character == 'P' || character == 'p') {
                pCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);


        // Count vowels
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char character = country.charAt(i);

            if (character == 'a' || character == 'e' ||
                    character == 'i' || character == 'o' ||
                    character == 'u' ||
                    character == 'A' || character == 'E' ||
                    character == 'I' || character == 'O' ||
                    character == 'U') {

                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
