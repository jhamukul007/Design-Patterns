package com.patters.factory.whatsapp;

import com.patters.factory.NotificationDetails;
import com.patters.factory.NotificationType;

public class WhatsappNotificationDetails implements NotificationDetails {

    private Long phoneNumber;
    private String message;

    public WhatsappNotificationDetails(Long phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.WHATSAPP;
    }
}
