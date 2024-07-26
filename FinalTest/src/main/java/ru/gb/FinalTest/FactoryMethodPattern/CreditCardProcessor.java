package ru.gb.FinalTest.FactoryMethodPattern;

import org.springframework.stereotype.Service;

@Service
public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment() {
        System.out.println("Оплата картой.");

    }
}
