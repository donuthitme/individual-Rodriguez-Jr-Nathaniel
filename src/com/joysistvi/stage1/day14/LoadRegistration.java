package com.joysistvi.stage1.day14;
import java.util.Scanner;

public class LoadRegistration {

    static Scanner input = new Scanner(System.in);
    double balance = 500;

    public static void main(String[] args) {
        dialUssdCode();
        mainMenu();
    }

    public static void dialUssdCode() {
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");

        String ussdCode = input.nextLine().trim();


        if (!ussdCode.equals("*143#")) {
            System.out.println("Invalid ussd code. Exiting...");
            System.exit(0);
        }
    }

    public static void mainMenu(){
        System.out.println("\n\nLoad Registration");
        System.out.println("[1] Unli Text");
        System.out.println("[2] Unli Call");
        System.out.println("[3] Unli Call N Text");
        System.out.println("[4] Load Promo");
        System.out.println("[5] Load");
        System.out.println("[6] Check Balance");
        System.out.println("[7] Borrow Load");
        System.out.println("[8] Exit");

        System.out.print("Enter choice: ");
        int mainMenuChoice = input.nextInt();

        switch (mainMenuChoice) {
            case 1:
                unliTextPromotion();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                exitFunction();
                break;
        }
    }

    public static void unliTextPromotion(){
        System.out.println("\n\nEnjoy Unli Text");
        System.out.println("[1] 1 day of Unli Text for P10");
        System.out.println("[2] 3 day of Unli Text for P30");
        System.out.println("[3] 5 day of Unli Text for P50");
        System.out.println("[4] Back");
        System.out.println("[5] Exit");
        System.out.print("Enter choice: ");
        int unliTextChoice = input.nextInt();

        switch (unliTextChoice) {
            case 1:
                confirmSubscription(1, 10);
                break;
            case 2:
                confirmSubscription(3, 30);
                break;
            case 3:
                confirmSubscription(5, 50);
                break;
        }
    }

    public static void confirmSubscription(int days, int price){
        System.out.println("\n\nGet " + days + " Unli Text Promo for only " + price);

        System.out.println("[1] Subscribe");
        System.out.println("[2] Back");
        System.out.print("Enter choice: ");
        int subscribeChoice = input.nextInt();

        if (subscribeChoice == 1) {
            System.out.println("You are now Subscribe to Unli Text Promo "+ price);
        }
        else if (subscribeChoice == 2) {
            unliTextPromotion();
        }
    }

    public static void exitFunction(){
        System.out.println("Are you sure you want to exit?");
        System.out.println("Press Y/y or N/n");
        String exitChoice = input.next().trim();

        if (exitChoice.equalsIgnoreCase("y")) {
            System.out.println("Exiting...");
            System.exit(0);
        }
        else if (exitChoice.equalsIgnoreCase("n")) {
            mainMenu();
        }
    }
}
