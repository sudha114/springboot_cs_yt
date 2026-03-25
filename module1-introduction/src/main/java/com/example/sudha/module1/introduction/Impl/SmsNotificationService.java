package com.example.sudha.module1.introduction.Impl;

import com.example.sudha.module1.introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Qualifier("smsNotif")
@Component
//@ConditionalOnProperty(name = "notification.type", havingValue ="sms" )
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("SMS Notification send .."+message);

    }
}
