package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.memento.example2;

import java.time.format.DateTimeFormatter;

/**
 * @author eugenia
 */
public class Main {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1 at " + System.currentTimeMillis());
        originator.setState("State 2 at " + System.currentTimeMillis());
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State 3 at " + System.currentTimeMillis());
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + originator.getState());
    }

}
