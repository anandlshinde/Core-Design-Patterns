package com.springforge.service.impl;

import com.springforge.service.Notification;

public class SlackNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Slack Notification...");
    }
}
