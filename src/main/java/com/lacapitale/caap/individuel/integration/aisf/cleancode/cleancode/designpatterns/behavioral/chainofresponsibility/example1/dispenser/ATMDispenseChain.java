package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example1.dispenser;

/**
 * @author eugenia
 */
public class ATMDispenseChain {

    private DispenseChain c1;

    /**
     * Default constructor
     */
    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    /**
     * Processes the dispense request
     *
     * @param amount amount
     */
    public void dispense(int amount) {
        c1.dispense(new Currency(amount));
    }


}
