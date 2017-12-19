package com.domain.notification;

import com.domain.booking.Booking;

public class MemberNotification implements PersonalNotification {
    public void sendNotification(Booking booking) {
        System.out.println("Send SMS & SMAIL notification to Member!");
    }
}
