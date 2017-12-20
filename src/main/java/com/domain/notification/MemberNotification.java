package com.domain.notification;

import com.domain.booking.Booking;

public class MemberNotification implements PersonalNotification {
    public void sendNotification(Booking booking) {
        System.out.print("Send SMS & SMAIL notification to Member!");
    }
}
