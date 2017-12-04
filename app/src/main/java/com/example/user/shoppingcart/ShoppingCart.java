package com.example.user.shoppingcart;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 04/12/2017.
 */

public class ShoppingCart {
    HashMap<Shoppable, Integer> shoppingCart;
    boolean loyaltyCard;


    public ShoppingCart(boolean loyaltyCard) {
        this.shoppingCart = new HashMap<>();
        this.loyaltyCard = loyaltyCard;
    }

    public HashMap<Shoppable, Integer> getShoppingCart() {
        return this.shoppingCart;
    }

    public int getAmountOfIndividualItems() {
        return this.shoppingCart.size();
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

    public double getValueOfShoppingCartWithoutDiscount() {
        double totalValue = 0;
        for (Map.Entry<Shoppable, Integer> item : shoppingCart.entrySet()) {
            totalValue += item.getKey().getPrice();
        }
        return totalValue;
    }
}
