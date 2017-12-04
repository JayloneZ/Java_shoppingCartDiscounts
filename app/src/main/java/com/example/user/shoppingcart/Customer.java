package com.example.user.shoppingcart;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03/12/2017.
 */

public class Customer {
    private HashMap<Shoppable, Integer> shoppingCart;

    public Customer() {
        shoppingCart = new HashMap<>();
    }

    public void addItemToCart(Shoppable item) {
        if (shoppingCart.get(item) == null) {
            this.shoppingCart.put(item, 1);
        }
        else {
            shoppingCart.put(item, shoppingCart.get(item) + 1);
        }
    }

    public void removeItemFromCart(Shoppable item) {
        this.shoppingCart.remove(item);
    }

    public void emptyShoppingCart() {
        this.shoppingCart.clear();
    }

    public HashMap<Shoppable, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void twoForOneDiscount() {
        for (Map.Entry<Shoppable, Integer> item : shoppingCart.entrySet()) {
            Integer twoForOne = (int) Math.ceil(item.getValue() / 2);
            shoppingCart.put(item.getKey(), twoForOne);
        }
    }

    public int getValueOfShoppingCart() {
        this.twoForOneDiscount();

        int totalValue = 0;
        for (Map.Entry<Shoppable, Integer> item : shoppingCart.entrySet()) {
            totalValue += item.getKey().getPrice();
        }
        return totalValue;
    }
}
