package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.observer.example2;

/**
 * @author eugenia
 */
class Manager extends Observer {

    public Manager(Programmer programmer) {
        this.programmer = programmer;
        this.programmer.attach(this);
    }

    @Override
    public void update() {
        if (this.programmer.getState().equalsIgnoreCase("Successful")) {
            System.out.println("Manager is happy with Lead Programmer and this Programmer.");
        } else {
            System.out.println("Manager is unhappy with Lead Programmer and this Programmer.");
        }
    }
}
