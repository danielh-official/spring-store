package com.codewithmosh.store.services;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Processing payment of " + amount);
    }
}
