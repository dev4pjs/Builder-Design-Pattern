package com.domain.notification;

import com.domain.booking.Booking;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FacilityNotificationTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Mock
    private Booking booking;
    private FacilityNotification facilityNotification;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        System.setOut(new PrintStream(outputStream));
        facilityNotification = new FacilityNotification();
    }

    @Test
    public void sendNotification() throws Exception {
        facilityNotification.sendNotification(booking);
        assertEquals("Send EMAIL notification to Facility!",outputStream.toString());
    }

}