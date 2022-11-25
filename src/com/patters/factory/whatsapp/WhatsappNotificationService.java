package com.patters.factory.whatsapp;

import com.patters.factory.NotificationDetails;
import com.patters.factory.NotificationService;

public class WhatsappNotificationService implements NotificationService {

    @Override
    public void sendNotification(NotificationDetails notificationDetails) {
        WhatsappNotificationDetails details = (WhatsappNotificationDetails) notificationDetails;
        System.out.println("Sending whatsapp message to user " + details.getPhoneNumber());
    }
}
