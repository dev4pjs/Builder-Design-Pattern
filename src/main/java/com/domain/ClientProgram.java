package com.domain;

import com.domain.booking.Booking;
import com.domain.booking.LifeTimememberGroupBooking;
import com.domain.builder.NotificationBuilder;
import com.domain.notification.Notification;

public class ClientProgram {
    public static void main(String[] args) {
        Booking b = new LifeTimememberGroupBooking();
        Notification n = NotificationBuilder.getNotification(b);
        n.notify(b);
    }
}
