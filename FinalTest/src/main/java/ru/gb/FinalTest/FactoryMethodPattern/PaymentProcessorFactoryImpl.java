package ru.gb.FinalTest.FactoryMethodPattern;

public class PaymentProcessorFactoryImpl implements PaymentProcessorFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        // Логика выбора

        return new CreditCardProcessor();
    }
}
