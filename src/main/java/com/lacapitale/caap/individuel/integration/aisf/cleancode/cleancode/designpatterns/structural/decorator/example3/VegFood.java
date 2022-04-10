package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example3;

/**
 * @author eugenia
 */
class VegFood implements Food {

    public String prepareFood() {
        return "Veg Food";
    }

    public double foodPrice() {
        return 50.0;
    }
}
