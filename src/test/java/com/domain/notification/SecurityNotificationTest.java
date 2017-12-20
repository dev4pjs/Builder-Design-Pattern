package com.domain.notification;

import com.domain.booking.Booking;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SecurityNotificationTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Mock
    private Booking booking;
    private SecurityNotification securityNotification;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        System.setOut(new PrintStream(outputStream));
        securityNotification = new SecurityNotification();
    }

    @Test
    public void sendNotification() throws Exception {
        securityNotification.sendNotification(booking);
        assertEquals("SMS Notification for Security sent out!",outputStream.toString());
    }

}