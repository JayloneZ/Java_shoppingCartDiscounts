package com.example.user.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 04/12/2017.
 */

public class DiscountTest {
    SkiMask skiMask;
    Rope rope;
    Plunger plunger;
    Customer customer;
    Customer customerLoyal;
    Discount discount;
    Discount discountLoyal;


    @Before
    public void before() {
        skiMask = new SkiMask();
        rope = new Rope();
        plunger = new Plunger();
        customer = new Customer(false);
        customerLoyal = new Customer(true);
        discount = new Discount(customer.getLoyaltyCard());
        discountLoyal = new Discount(customerLoyal.getLoyaltyCard());

    }

    @Test
    public void canCalculateShoppingCartValueWithTwoForOne() {
        customer.addItemToCart(skiMask);
        customer.addItemToCart(skiMask);
        assertEquals(4, customer.getValueOfShoppingCart(), 0.1);
    }

    @Test
    public void tenPercentDiscountNotAppliedWhenUnderTwenty() {
        customer.addItemToCart(rope);
        customer.addItemToCart(skiMask);
        assertEquals(19, customer.getValueOfShoppingCart(), 0.1);
    }

    @Test
    public void tenPercentDiscountAppliedWhenOverTwenty() {
        customer.addItemToCart(rope);
        customer.addItemToCart(rope);
        customer.addItemToCart(plunger);
        assertEquals(22.5, customer.getValueOfShoppingCart(), 0.1);
    }
}
