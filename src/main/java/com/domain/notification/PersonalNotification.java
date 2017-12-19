package com.domain.notification;

import com.domain.booking.Booking;

public interface PersonalNotification {
    public void sendNotification(Booking booking);
}
