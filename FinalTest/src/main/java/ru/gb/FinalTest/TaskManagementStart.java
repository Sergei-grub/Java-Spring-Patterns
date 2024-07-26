package ru.gb.FinalTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.gb.FinalTest.FactoryMethodPattern.PaymentProcessorFactoryImpl;

@SpringBootApplication
public class TaskManagementStart {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementStart.class, args);



		PaymentProcessorFactoryImpl test1 = new PaymentProcessorFactoryImpl();
		test1.createPaymentProcessor().processPayment();

	}
}
