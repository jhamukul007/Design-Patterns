package com.patters.factory.email;

import com.patters.factory.NotificationDetails;
import com.patters.factory.NotificationType;

import java.util.List;

public class EmailNotificationDetails implements NotificationDetails {
    private List<String> to;
    private String subject;
    private String content;

    public EmailNotificationDetails(List<String> to, String subject, String content) {
        this.to = to;
        this.subject = subject;
        this.content = content;
    }

    public List<String> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.EMAIL;
    }
}

