package com.nabgc.conditionalonproperty.service;

public class SmsNotification implements NotificationSender {

    @Override
    public String send(String message) {
        return "SMS notification: " + message;
    }

}
