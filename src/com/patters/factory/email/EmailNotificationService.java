package com.patters.factory.email;

import com.patters.factory.NotificationDetails;
import com.patters.factory.NotificationService;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(NotificationDetails notificationDetails) {
        EmailNotificationDetails details = (EmailNotificationDetails) notificationDetails;
        System.out.println("Sending email notification to emailId: " + details.getTo() + " with subject: " + details.getSubject());
    }
}
