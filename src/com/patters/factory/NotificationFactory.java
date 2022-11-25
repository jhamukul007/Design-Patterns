package com.patters.factory;

import com.patters.factory.email.EmailNotificationService;
import com.patters.factory.sms.SmsNotificationService;
import com.patters.factory.whatsapp.WhatsappNotificationService;

public class NotificationFactory {
    public static NotificationService getNotificationService(NotificationType notificationType) {
        switch (notificationType) {
            case SMS: return new SmsNotificationService();
            case WHATSAPP: return new WhatsappNotificationService();
            case EMAIL: return new EmailNotificationService();
            default: throw new IllegalArgumentException("Illegal notification type: " + notificationType);
        }
    }
}
