package com.springforge.service.impl;

import com.springforge.service.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notification...");
    }
}
