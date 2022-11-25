package com.patters.factory.sms;

import com.patters.factory.NotificationDetails;
import com.patters.factory.NotificationService;

public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(NotificationDetails notificationDetails) {
        SmsNotificationDetails smsNotificationDetails = (SmsNotificationDetails) notificationDetails;
        System.out.println("Sending sms notification on contact: " + smsNotificationDetails.getPhoneNumber());
    }
}
