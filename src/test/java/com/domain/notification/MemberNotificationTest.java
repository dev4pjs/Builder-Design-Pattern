package com.domain.notification;

import com.domain.booking.Booking;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MemberNotificationTest {

    private  final ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();

    @Mock
    private Booking booking;
    private MemberNotification memberNotification;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        System.setOut(new PrintStream(outputStream));
        memberNotification = new MemberNotification();
    }

    @Test
    public void sendNotification() throws Exception {
        memberNotification.sendNotification(booking);
        assertEquals("Send SMS & SMAIL notification to Member!",outputStream.toString());
    }

}