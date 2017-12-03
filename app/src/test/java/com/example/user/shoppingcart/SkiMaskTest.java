package com.example.user.shoppingcart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/12/2017.
 */

public class SkiMaskTest {

    @Test
    public void canGetPrice() {
        SkiMask skiMask = new SkiMask();
        assertEquals(4, skiMask.getPrice());
    }
}
