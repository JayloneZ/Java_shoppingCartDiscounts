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
        shoppingCart = new ShoppingCart(false);
    }

    @Test
    public void shoppingCartStartsEmpty() {
        assertEquals(0, shoppingCart.getAmountOfIndividualItems());
    }

    @Test
    public void canAddItem() {
        shoppingCart.addItemToCart(rope);
        assertEquals(1, shoppingCart.getAmountOfIndividualItems());
    }

    @Test
    public void canRemoveItem() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.removeItemFromCart(rope);
        assertEquals(0, shoppingCart.getAmountOfIndividualItems());
    }

    @Test
    public void canClearBasket() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.addItemToCart(skiMask);
        shoppingCart.emptyShoppingCart();
        assertEquals(0, shoppingCart.getAmountOfIndividualItems());
    }

    @Test
    public void canCalculateShoppingCartTotalValue() {
        shoppingCart.addItemToCart(rope);
        shoppingCart.addItemToCart(skiMask);
        assertEquals(19, shoppingCart.getValueOfShoppingCartWithoutDiscount(), 0.1);
    }
}
