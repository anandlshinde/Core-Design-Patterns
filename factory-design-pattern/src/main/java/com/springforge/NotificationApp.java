package com.springforge;

import com.springforge.factory.NotificationFactory;
import com.springforge.service.Notification;
import com.springforge.service.impl.SlackNotification;

public class NotificationApp {
    public static void main(String[] args) {

        NotificationFactory factory=new NotificationFactory();


        Notification emailNotification = factory.createNotification("EMAIL");
        emailNotification.notifyUser();

        Notification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();


        NotificationFactory.register("Slack", SlackNotification::new);

        Notification slackNotification = factory.createNotification("Slack");
        slackNotification.notifyUser();
    }
}