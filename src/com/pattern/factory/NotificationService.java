package com.pattern.factory;

public class NotificationService
{
    public static void main(String[] args) {
        //NotificationFactory factory=new NotificationFactory();
        Notification notification=NotificationFactory.createNotification("EMAIL");
        notification.notifyUser();
    }
}
