package com.joysistvi.stage2.discussion.day20;

public abstract class Payment {
    double balance;
    double amount;

    public Payment(double balance) {

        this.balance = balance;
    }

    //Polymorphism: Method overriding
    void pay(double amount) {
        System.out.println("Processing generic payment of amount " + amount);
    }

}

