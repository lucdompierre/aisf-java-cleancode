package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.strategy.example2;

/**
 * @author eugenia
 */
class House implements Strategy {

    @Override
    public String build(String location) {
        return "Building a house in the " + location + " area.";
    }
}
