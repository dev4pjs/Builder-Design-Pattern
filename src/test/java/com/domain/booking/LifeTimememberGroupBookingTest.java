package com.domain.booking;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LifeTimememberGroupBookingTest {

    Booking booking;

    @Before
    public void before(){
        booking = new LifeTimememberGroupBooking();
    }

    @Test
    public void getType() throws Exception {
        assertThat(booking.getType(), Is.isA(String.class));
    }

    @Test
    public void getType_AsLifemember(){
        assertEquals("lifemember",booking.getType());
    }
}