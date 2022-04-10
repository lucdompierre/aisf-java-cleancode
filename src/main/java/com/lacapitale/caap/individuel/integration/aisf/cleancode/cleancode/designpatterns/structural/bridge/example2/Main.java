package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.bridge.example2;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        Animal bigDog = new Dog(3, 500, "Meat", new BigDog());
        Animal smallDog = new Dog(2, 250, "Granules", new SmallDog());

        bigDog.feed();
        smallDog.feed();
    }
}
