package com.prasanna.nsk.internal.working.of.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name ="payment.provider",havingValue = "razorpay")
public class RazorPayPaymentService implements PaymentService {

    @Override
    public String pay(){
        String payment ="Razorpay_Payment";
        System.out.println("Payment From : "+payment);
        return payment;
    }
}
