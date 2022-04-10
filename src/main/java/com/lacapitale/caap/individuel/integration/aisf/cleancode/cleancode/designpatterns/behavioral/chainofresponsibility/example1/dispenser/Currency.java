package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example1.dispenser;

/**
 * Stores the amount to dispense and used by the chain implementations.
 *
 * @author eugenia
 */
class Currency {

    private int amount;

    Currency(int amt) {
        this.amount = amt;
    }

    public int getAmount() {
        return this.amount;
    }
}
