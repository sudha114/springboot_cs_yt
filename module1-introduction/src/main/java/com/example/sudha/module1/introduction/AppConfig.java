package com.example.sudha.module1.introduction;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    PaymentService paymentService(){
        // more logics present
        return new PaymentService();

    }

}
