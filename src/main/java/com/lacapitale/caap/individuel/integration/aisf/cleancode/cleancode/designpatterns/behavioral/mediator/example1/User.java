package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.mediator.example1;

/**
 * Mediator Pattern Colleague (can be interface or abstract class, abstract class in this case).
 * It can be called a Colleague Interface as system objects that communicate each other are called Colleagues
 * from Mediator pattern perspective.
 *
 * @author eugenia
 */
abstract class User {

    /**
     * User has a reference to the mediator object, it’s required for the communication between different users.
     */
    protected ChatMediator mediator;

    /**
     * User name
     */
    protected String name;

    public User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
