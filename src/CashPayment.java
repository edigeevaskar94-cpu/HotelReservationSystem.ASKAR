package com.hotel.payment;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid cash: $" + amount);
    }
}

