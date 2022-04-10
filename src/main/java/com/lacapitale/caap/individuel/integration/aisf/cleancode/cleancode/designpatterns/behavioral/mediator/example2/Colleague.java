package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.mediator.example2;

/**
 * @author eugenia
 */
abstract class Colleague {

    private Mediator mediator;

    Colleague(Mediator m) {
        mediator = m;
    }

    /**
     * Sends a message via the mediator
     *
     * @param message message
     */
    public void send(String message) {
        mediator.send(message, this);
    }

    /**
     * Gets access to the mediator
     *
     * @return {@link Mediator}
     */
    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}
