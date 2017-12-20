package com.domain.notification;

import com.domain.booking.Booking;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NotificationTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    private Notification notification;

    @Mock
    private Booking booking;


    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        notification = new Notification();
        System.setOut(new PrintStream(outputStream));

    }


    @Test
    public void getListOfPersonalNotifications() throws Exception {
        assertEquals(0,notification.getListOfPersonalNotifications().size());
    }

    @Test
    public void setListOfPersonalNotifications() throws Exception {
        List<PersonalNotification> listOfPersonalNotifications = new ArrayList<PersonalNotification>();
        listOfPersonalNotifications.add(new CoachNotification());
        notification.setListOfPersonalNotifications(listOfPersonalNotifications);
        assertEquals(1, notification.getListOfPersonalNotifications().size());
    }

    @Test
    public void notifyMessage() throws Exception {
        List<PersonalNotification> listOfPersonalNotifications = new ArrayList<PersonalNotification>();
        listOfPersonalNotifications.add(new CoachNotification());
        notification.setListOfPersonalNotifications(listOfPersonalNotifications);
        notification.notifyMessage(booking);
        assertEquals("Send EMAIL notification to Coach!",outputStream.toString());

    }

}