package com.springforge.service.impl;

import com.springforge.service.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notification...");
    }
}
