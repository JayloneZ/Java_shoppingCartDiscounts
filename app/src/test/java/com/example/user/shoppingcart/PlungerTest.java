package com.example.user.shoppingcart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/12/2017.
 */

public class PlungerTest {

    @Test
    public void canGetPrice() {
        Plunger plunger = new Plunger();
        assertEquals(10, plunger.getPrice());
    }
}
