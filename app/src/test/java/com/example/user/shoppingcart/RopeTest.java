package com.example.user.shoppingcart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/12/2017.
 */

public class RopeTest {

    @Test
    public void canGetPrice() {
        Rope rope = new Rope();
        assertEquals(15, rope.getPrice());
    }
}
