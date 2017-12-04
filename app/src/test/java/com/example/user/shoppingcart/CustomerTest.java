package com.example.user.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 04/12/2017.
 */

public class CustomerTest {
    Plunger plunger;
    Rope rope;
    SkiMask skiMask;
    Customer customer;

    @Before
    public void before() {
        plunger = new Plunger();
        rope = new Rope();
        skiMask = new SkiMask();
        customer = new Customer(false);
    }

    @Test
    public void shoppingCartStartsEmpty() {
        assertEquals(0, customer.getAmountOfIndividualItems());
    }

    @Test
    public void canAddItemToCart() {
        customer.addItemToCart(rope);
        assertEquals(1, customer.getAmountOfIndividualItems());
    }

    @Test
    public void canRemoveItemFromCart() {
        customer.addItemToCart(rope);
        customer.removeItemFromCart(rope);
        assertEquals(0, customer.getAmountOfIndividualItems());
    }

    @Test
    public void canEmptyCart() {
        customer.addItemToCart(rope);
        customer.addItemToCart(rope);
        customer.emptyShoppingCart();
        assertEquals(0, customer.getAmountOfIndividualItems());
    }


    @Test
    public void canCalculateShoppingCartTotalValue() {
        customer.addItemToCart(rope);
        customer.addItemToCart(skiMask);
        assertEquals(19, customer.getValueOfShoppingCart(), 0.1);
    }
}
