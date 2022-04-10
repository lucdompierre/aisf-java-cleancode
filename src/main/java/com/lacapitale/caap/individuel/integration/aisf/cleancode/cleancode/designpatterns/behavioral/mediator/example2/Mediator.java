package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.mediator.example2;

/**
 * Mediator interface
 * Defines the contract for concrete mediators.
 *
 * @author eugenia
 */
interface Mediator {

    void send(String message, Colleague colleague);
}
