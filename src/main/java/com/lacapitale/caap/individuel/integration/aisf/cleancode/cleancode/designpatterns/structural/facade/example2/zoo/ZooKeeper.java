package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.facade.example2.zoo;

/**
 * This is where the Facade pattern kicks in.
 * By using this interface, the client doesn't concern themselves with the logic behind feeding the animals.
 *
 * @author eugenia
 */
public class ZooKeeper {

    private Animal lion;
    private Animal wolf;
    private Animal bear;

    public ZooKeeper() {
        lion = new Lion();
        wolf = new Wolf();
        bear = new Bear();
    }

    public void feedLion() {
        lion.feed();
    }

    public void feedWolf() {
        wolf.feed();
    }

    public void feedBear() {
        bear.feed();
    }
}
