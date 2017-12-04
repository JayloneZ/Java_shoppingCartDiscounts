package com.example.user.shoppingcart;


/**
 * Created by user on 03/12/2017.
 */

public class Customer {
    private ShoppingCart shoppingCart;
    private boolean loyaltyCard;
    private Discount discount;

    public Customer(boolean loyaltyCard) {
        this.shoppingCart = new ShoppingCart(loyaltyCard);
        this.loyaltyCard = loyaltyCard;
        this.discount = new Discount(loyaltyCard);
    }

    public ShoppingCart getShoppingCart() {
        return this.shoppingCart;
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

    public double getValueOfShoppingCartWithoutDiscount() {
        return this.shoppingCart.getValueOfShoppingCartWithoutDiscount();
    }

    public double getValueOfShoppingCart() {
        this.discount.twoForOneDiscount();

        double totalValue = this.getValueOfShoppingCartWithoutDiscount();

        totalValue = this.discount.tenPercentDiscount(totalValue);
        totalValue = this.discount.twentyPercentLoyaltyDiscount(totalValue);
        return totalValue;
    }

}
