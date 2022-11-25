package com.patters.factory;

import com.patters.factory.email.EmailNotificationDetails;
import com.patters.factory.sms.SmsNotificationDetails;
import com.patters.factory.whatsapp.WhatsappNotificationDetails;

import java.util.List;

import static com.patters.factory.NotificationType.EMAIL;
import static com.patters.factory.NotificationType.SMS;
import static com.patters.factory.NotificationType.WHATSAPP;

public class ClientRunner {
    public static void main(String[] args) {
        EmailNotificationDetails email = new EmailNotificationDetails(List.of("mukul@xyz.com","rahul@xyz.com"),
        "Bill update",  "1280 bill paid");
        NotificationFactory.getNotificationService(EMAIL).sendNotification(email);

        SmsNotificationDetails sms = new SmsNotificationDetails(9600000000L, "Hello Mukul !!!");
        NotificationFactory.getNotificationService(SMS).sendNotification(sms);

        WhatsappNotificationDetails whatsapp = new WhatsappNotificationDetails(8700000000L, "Hi Jack !!!");
        NotificationFactory.getNotificationService(WHATSAPP).sendNotification(whatsapp);
    }
}
