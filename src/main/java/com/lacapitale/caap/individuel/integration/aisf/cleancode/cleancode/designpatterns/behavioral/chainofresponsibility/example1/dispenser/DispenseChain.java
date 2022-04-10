package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example1.dispenser;

/**
 * @author eugenia
 */
interface DispenseChain {

    /**
     * Defines the next processor in the chain
     *
     * @param nextChain next processor
     */
    void setNextChain(DispenseChain nextChain);

    /**
     * Processes the request
     * If one of the chain method implementation not able to process it fully,
     * it sends the request to the next processor in chain to process the remaining request.
     * If the processor is not able to process anything, it just forwards the same request to the next chain.
     *
     * @param cur currency
     */
    void dispense(Currency cur);
}
