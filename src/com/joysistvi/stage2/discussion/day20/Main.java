package com.joysistvi.stage2.discussion.day20;

public class Main {
    public static void main(String[] args) {
        GCashPayment gcash = new GCashPayment(5000, 20000);
        CashPayment cash = new CashPayment(5000);
        CreditCardPayment card = new CreditCardPayment(5000);

        gcash.pay(1500);
        cash.pay(1500);
        card.pay(1500);

    }
}
