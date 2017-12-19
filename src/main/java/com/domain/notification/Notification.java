package com.domain.notification;

import com.domain.booking.Booking;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private List<PersonalNotification> listOfPersonalNotifications = new ArrayList<PersonalNotification>();

    public List<PersonalNotification> getListOfPersonalNotifications() {
        return listOfPersonalNotifications;
    }

    public void setListOfPersonalNotifications(List<PersonalNotification> listOfPersonalNotifications) {
        this.listOfPersonalNotifications = listOfPersonalNotifications;
    }

    public void notify(Booking booking){
        for(PersonalNotification p : listOfPersonalNotifications){
            p.sendNotification(booking);
        }
    }
}
