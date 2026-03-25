package com.example.sudha.module1.introduction;

import com.example.sudha.module1.introduction.Impl.EmailNotificationService;
import com.example.sudha.module1.introduction.Impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

  //  @Autowired
     final NotificationService notificationServiceObj; //Dependency Injection

    @Autowired
    public Module1IntroductionApplication( NotificationService notificationServiceObj) {
        this.notificationServiceObj = notificationServiceObj;    // Constructor DI - Preferred
    }

    public static void main(String[] args) {

        SpringApplication.run(Module1IntroductionApplication.class, args);

	}


    @Override
    public void run(String... args) throws Exception {

       // NotificationService notificationServiceObj= new EmailNotificationService();
        notificationServiceObj.send("Hey, are you there?");


    }
}
