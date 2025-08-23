package com.springforge.service.impl;

import com.springforge.service.Notification;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification...");
    }
}
