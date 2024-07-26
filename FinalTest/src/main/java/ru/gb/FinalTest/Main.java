package ru.gb.FinalTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.gb.FinalTest.FactoryMethodPattern.PaymentProcessorFactoryImpl;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		PaymentProcessorFactoryImpl test = new PaymentProcessorFactoryImpl();
		test.createPaymentProcessor().processPayment();
	}
}
