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
    ShoppingCart shoppingCart;

    @Before
    public void before() {
        plunger = new Plunger();
        rope = new Rope();
        skiMask = new SkiMask();
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void shoppingCartStartsEmpty() {
        assertEquals(0, shoppingCart.getShoppingCart().size());
    }

    @Test
    public void canAddItem() {
        shoppingCart.addItemToCart(rope);
        assertEquals(1, shoppingCart.getShoppingCart().size());
    }

    @Test
    public void canRemoveItem() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.removeItemFromCart(rope);
        assertEquals(0, shoppingCart.getShoppingCart().size());
    }

    @Test
    public void canClearBasket() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.addItemToCart(skiMask);
        shoppingCart.emptyShoppingCart();
        assertEquals(0, shoppingCart.getShoppingCart().size());
    }

    @Test
    public void canCalculateShoppingCartTotalValue() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.addItemToCart(skiMask);
        assertEquals(19, shoppingCart.getValueOfShoppingCart(), 0.1);
    }

    @Test
    public void canCalculateShoppingCartValueWithTwoForOne() {
        shoppingCart.addItemToCart(skiMask);
        shoppingCart.addItemToCart(skiMask);
        assertEquals(4, shoppingCart.getValueOfShoppingCart(), 0.1);
    }

    @Test
    public void tenPercentDiscountNotAppliedWhenUnderTwenty() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.addItemToCart(skiMask);
        assertEquals(19, shoppingCart.getValueOfShoppingCart(), 0.1);
    }

    @Test
    public void tenPercentDiscountAppliedWhenOverTwenty() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.addItemToCart(rope);
        shoppingCart.addItemToCart(plunger);
        assertEquals(22.5, shoppingCart.getValueOfShoppingCart(), 0.1);
    }
}
