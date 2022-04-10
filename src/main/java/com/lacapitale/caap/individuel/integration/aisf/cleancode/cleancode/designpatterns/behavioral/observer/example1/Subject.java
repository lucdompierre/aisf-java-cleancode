package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.observer.example1;

/**
 * Base Subject interface that defines the contract methods to be implemented by any concrete subjects
 *
 * @author eugenia
 */
interface Subject {

    /**
     * Registers observers
     *
     * @param obj {@link Observer}
     */
    void register(Observer obj);

    /**
     * Unregister observers
     *
     * @param obj {@link Observer}
     */
    void unregister(Observer obj);

    /**
     * Notifies observers of change
     */
    void notifyObservers();

    /**
     * Gets updates from subject
     *
     * @param obj {@link Observer}
     * @return {@link Object}
     */
    Object getUpdate(Observer obj);
}
