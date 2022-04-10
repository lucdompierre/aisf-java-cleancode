package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.mediator.example2;

/**
 * @author eugenia
 */
class DesktopColleague extends Colleague {

    public DesktopColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Desktop Received: " + message);
    }
}
