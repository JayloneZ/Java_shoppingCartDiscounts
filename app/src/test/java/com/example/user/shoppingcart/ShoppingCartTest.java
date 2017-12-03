package com.example.user.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/12/2017.
 */

public class ShoppingCartTest {
    Plunger plunger;
    Rope rope;
    SkiMask skiMask;
    Customer customer;

    @Before
    public void before() {
        plunger = new Plunger();
        rope = new Rope();
        skiMask = new SkiMask();
        customer = new Customer();
    }

    @Test
    public void shoppingCartStartsEmpty() {
        assertEquals(0, customer.getShoppingCart().size());
    }

    @Test
    public void canAddItem() {
        customer.addItemToCart(rope);
        assertEquals(1, customer.getShoppingCart().size());
    }

    @Test
    public void canRemoveItem() {
        customer.addItemToCart(rope);
        customer.removeItemFromCart(rope);
        assertEquals(0, customer.getShoppingCart().size());
    }
}
