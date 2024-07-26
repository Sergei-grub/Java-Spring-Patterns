package ru.gb.FinalTest.FactoryMethodPattern;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Оплата через систему PayPal.");
    }
}
