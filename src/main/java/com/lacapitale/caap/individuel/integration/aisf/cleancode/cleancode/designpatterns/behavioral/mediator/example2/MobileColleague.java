package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.mediator.example2;

/**
 * @author eugenia
 */
class MobileColleague extends Colleague {

    MobileColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }
}
