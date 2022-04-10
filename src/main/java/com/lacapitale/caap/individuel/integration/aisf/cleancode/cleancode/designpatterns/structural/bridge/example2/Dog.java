package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.bridge.example2;

/**
 * This is where the Bridge pattern kicks in.
 * A bridge class is created that segregates the abstract Animal class from its implementation
 *
 * @author eugenia
 */
class Dog extends Animal {

    private int timesADay, amount;
    private String typeOfFood;

    public Dog(int timesADay, int amount, String typeOfFood, FeedingAPI feedingAPI) {
        super(feedingAPI);
        this.timesADay = timesADay;
        this.amount = amount;
        this.typeOfFood = typeOfFood;
    }

    public void feed() {
        feedingAPI.feed(timesADay, amount, typeOfFood);
    }
}
