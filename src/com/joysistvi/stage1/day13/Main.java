package com.joysistvi.stage1.day13;

public class Main {
    //Create object
    public static void main(String[] args) {
        Laptop lappy = new Laptop();

        lappy.color = "Black";
        lappy.brand = "Laptop";
        lappy.weightInKg = 1.5;
        lappy.cpu = "Ryzen 5 5600G";
        lappy.ramInGb = 16;

        lappy.writeCodes();
        lappy.playGames();
        lappy.watchTutorials();
        lappy.sendEmail();

        System.out.println(lappy.color);

        Laptop lappy2 = new Laptop();

        lappy2.color = "Black";
        lappy2.brand = "Laptop";
        lappy2.weightInKg = 1.5;
        lappy2.cpu = "Ryzen 5 5600G";
        lappy2.ramInGb = 16;

        lappy2.writeCodes();
        lappy2.playGames();
        lappy2.watchTutorials();
        lappy2.sendEmail();

        System.out.println(lappy2.color);

        Laptop lappy3 = new Laptop();

        lappy3.color = "Black";
        lappy3.brand = "Laptop";
        lappy3.weightInKg = 1.5;
        lappy3.cpu = "Ryzen 5 5600G";
        lappy3.ramInGb = 16;

        lappy3.writeCodes();
        lappy3.playGames();
        lappy3.watchTutorials();
        lappy3.sendEmail();

        System.out.println(lappy3.color);
    }

}
