package com.springforge.factory;

import com.springforge.service.Notification;
import com.springforge.service.impl.EmailNotification;
import com.springforge.service.impl.PushNotification;
import com.springforge.service.impl.SmsNotification;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

   private static final Map<String, Supplier<Notification>> notificationMap=new HashMap<>();

   static {
       notificationMap.put("EMAIL",EmailNotification::new);
       notificationMap.put("SMS",SmsNotification::new);
       notificationMap.put("PUSH",PushNotification::new);
   }

   public Notification createNotification(String type){
       Supplier<Notification> notificationSupplier = notificationMap.get(type.toUpperCase());
       if(notificationSupplier!=null){
           return notificationSupplier.get();
       }
       throw new IllegalArgumentException("UnKnow notification type "+type);
   }

   public static void register(String type,Supplier<Notification> supplier){
        notificationMap.put(type.toUpperCase(),supplier);
   }
}
