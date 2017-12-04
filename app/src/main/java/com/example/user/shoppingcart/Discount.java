package com.example.user.shoppingcart;

import java.util.Map;

/**
 * Created by user on 04/12/2017.
 */

public class Discount {
    private boolean loyaltyCard;
    private ShoppingCart shoppingCart;

    public Discount(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
        this.shoppingCart = new ShoppingCart(loyaltyCard);
    }

    public void twoForOneDiscount() {
        for (Map.Entry<Shoppable, Integer> item : shoppingCart.getShoppingCart().entrySet()) {
            Integer twoForOne = (int) Math.ceil(item.getValue() / 2);
            shoppingCart.getShoppingCart().put(item.getKey(), twoForOne);
        }
    }

    public double tenPercentDiscount(double cartValue) {
        if (cartValue >= 20) {
            cartValue = (cartValue * 0.9);
        }
        return cartValue;
    }

    public double twentyPercentLoyaltyDiscount(double cartValue) {
        if (this.loyaltyCard) {
            cartValue = (cartValue * 0.8);
        }
        return cartValue;
    }
}
