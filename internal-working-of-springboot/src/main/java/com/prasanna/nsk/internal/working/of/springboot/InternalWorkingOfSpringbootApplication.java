package com.prasanna.nsk.internal.working.of.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(InternalWorkingOfSpringbootApplication.class, args);

	}

    @Autowired
    private final PaymentService paymentService;

    public InternalWorkingOfSpringbootApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
       String payment= paymentService.pay();
       System.out.println("Payment done : "+payment);
    }
}
