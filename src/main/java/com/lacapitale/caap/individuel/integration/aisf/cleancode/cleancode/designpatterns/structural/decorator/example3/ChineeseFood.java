package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example3;

/**
 * @author eugenia
 */
class ChineeseFood extends FoodDecorator {

    public ChineeseFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " With Fried Rice and Manchurian  ";
    }

    public double foodPrice() {
        return super.foodPrice() + 65.0;
    }
}
