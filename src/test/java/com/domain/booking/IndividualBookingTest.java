package com.domain.booking;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndividualBookingTest {

    Booking booking;

    @Before
    public void before(){
        booking = new IndividualBooking();
    }

    @Test
    public void getType() throws Exception {
       assertThat(booking.getType(), Is.isA(String.class));
    }

    @Test
    public void getType_AsIndividual(){
        assertEquals("individual",booking.getType());
    }

}