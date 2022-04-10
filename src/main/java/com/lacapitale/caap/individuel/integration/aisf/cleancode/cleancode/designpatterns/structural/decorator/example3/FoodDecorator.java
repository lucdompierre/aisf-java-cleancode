package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example3;

/**
 * The abstract class implements the Food interface and override it's all methods and it has the ability to decorate some more foods.
 *
 * @author eugenia
 */
class FoodDecorator implements Food {

    private Food newFood;

    public FoodDecorator(Food newFood) {
        this.newFood = newFood;
    }

    public String prepareFood() {
        return newFood.prepareFood();
    }

    public double foodPrice() {
        return newFood.foodPrice();
    }
}
