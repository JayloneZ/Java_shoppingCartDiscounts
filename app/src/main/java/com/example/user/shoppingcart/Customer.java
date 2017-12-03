package com.example.user.shoppingcart;

import java.util.ArrayList;

/**
 * Created by user on 03/12/2017.
 */

public class Customer {
    private ArrayList<Shoppable> shoppingCart;

    public Customer() {
        shoppingCart = new ArrayList<>();
    }

    public void addItemToCart(Shoppable item) {
        this.shoppingCart.add(item);
    }

    public void removeItemFromCart(Shoppable item) {
        this.shoppingCart.remove(item);
    }

    public void emptyShoppingCart() {
        this.shoppingCart.clear();
    }

    public ArrayList<Shoppable> getShoppingCart() {
        return shoppingCart;
    }
}
