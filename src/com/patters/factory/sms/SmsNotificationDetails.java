package com.patters.factory.sms;

import com.patters.factory.NotificationDetails;
import com.patters.factory.NotificationType;

public class SmsNotificationDetails implements NotificationDetails {
    private Long phoneNumber;
    private String text;

    public SmsNotificationDetails(Long phoneNumber, String text) {
        this.phoneNumber = phoneNumber;
        this.text = text;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getText() {
        return text;
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.SMS;
    }


}
