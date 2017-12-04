package com.example.user.shoppingcart;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03/12/2017.
 */

public class Customer {
    private ShoppingCart shoppingCart;
    private boolean loyaltyCard;

    public Customer(boolean loyaltyCard) {
        this.shoppingCart = new ShoppingCart(loyaltyCard);
        this.loyaltyCard = loyaltyCard;
    }

    public int getAmountOfIndividualItems() {
        return this.shoppingCart.getAmountOfIndividualItems();
    }

    public boolean getLoyaltyCard() {
        return loyaltyCard;
    }

    public void addItemToCart(Shoppable item) {
        this.shoppingCart.addItemToCart(item);
    }

    public void removeItemFromCart(Shoppable item) {
        this.shoppingCart.removeItemFromCart(item);
    }

    public void emptyShoppingCart() {
        this.shoppingCart.emptyShoppingCart();
    }

    public double getValueOfShoppingCart() {
        return this.shoppingCart.getValueOfShoppingCart();
    }

}
