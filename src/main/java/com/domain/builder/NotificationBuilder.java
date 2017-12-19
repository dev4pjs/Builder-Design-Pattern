package com.domain.builder;

import com.domain.booking.Booking;
import com.domain.notification.*;

public class NotificationBuilder {


    public static Notification getNotification(Booking booking){
        if(booking.getType().equals("individual")){
            return getIndividualBookingNotification(booking);

        }else if (booking.getType().equals("coaching")){
            return getCoachBookingNotification(booking);
        }else if(booking.getType().equals("lifemember")){
            return getLifeTimeMemberGroupBookingNotification(booking);
        }
        return new Notification();
    }

    private static Notification getIndividualBookingNotification(Booking booking){
        Notification n = new Notification();
        n.getListOfPersonalNotifications().add(new SecurityNotification());
        n.getListOfPersonalNotifications().add((new MemberNotification()));
        return n;
    }

    private static Notification getCoachBookingNotification(Booking booking){
        Notification n = new Notification();
        n.getListOfPersonalNotifications().add(new SecurityNotification());
        n.getListOfPersonalNotifications().add(new MemberNotification());
        n.getListOfPersonalNotifications().add(new CoachNotification());
        return n;
    }

    private static Notification getLifeTimeMemberGroupBookingNotification(Booking booking){
        Notification n = new Notification();
        n.getListOfPersonalNotifications().add(new SecurityNotification());
        n.getListOfPersonalNotifications().add(new MemberNotification());
        n.getListOfPersonalNotifications().add(new CoachNotification());
        n.getListOfPersonalNotifications().add(new FacilityNotification());
        return n;
    }

}
