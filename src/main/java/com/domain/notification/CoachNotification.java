package com.domain.notification;

import com.domain.booking.Booking;

public class CoachNotification implements PersonalNotification {

    public void sendNotification(Booking booking) {
        System.out.print("Send EMAIL notification to Coach!");
    }
}
