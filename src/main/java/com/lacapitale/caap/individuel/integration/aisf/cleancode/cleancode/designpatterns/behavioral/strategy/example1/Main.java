package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.strategy.example1;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("1234", 10));
        cart.addItem(new Item("5678", 40));

        //pay by PayPal
        cart.pay(new PayPalStrategy("myemail@example.com", "myPwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
