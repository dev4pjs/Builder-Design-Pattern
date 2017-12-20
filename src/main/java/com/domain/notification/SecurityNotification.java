package com.domain.notification;

import com.domain.booking.Booking;

public class SecurityNotification implements PersonalNotification {

    public void sendNotification(Booking booking) {
        System.out.print("SMS Notification for Security sent out!");
    }
}
