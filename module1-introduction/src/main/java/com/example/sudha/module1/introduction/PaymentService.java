package com.example.sudha.module1.introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Service
//@Controller
//@Repository
//@RestController
public class PaymentService {

    public void pay(){
        System.out.println("Pay.....");
    }


    @PostConstruct
    public void initaaaa(){
        System.out.println("Before Paying");
    }

    @PreDestroy
    public void destroyBean(){
        System.out.println("Payment Done..");
    }
}
