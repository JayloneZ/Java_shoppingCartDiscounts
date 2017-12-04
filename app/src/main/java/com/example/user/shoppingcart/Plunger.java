package com.example.user.shoppingcart;

/**
 * Created by user on 03/12/2017.
 */

public class Plunger implements Shoppable {
    private double price;

    public Plunger() {
        this.price = 10;
    }

    public double getPrice() {
        return price;
    }
}
