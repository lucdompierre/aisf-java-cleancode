package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.strategy.example2;

/**
 * @author eugenia
 */
class BuildContext {

    private Strategy strategy;

    public BuildContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String location) {
        return strategy.build(location);
    }
}
