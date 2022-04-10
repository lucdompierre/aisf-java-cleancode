package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example2.reciever;

/**
 * Receiver which implementations will actually do all the work.
 *
 * @author eugenia
 */
public class Application {

    private String name = "Computer Application";
    private int quantity = 2;

    public void make() {
        System.out.println(quantity + " application(s) are made for the client.");
    }

    public void sell() {
        System.out.println(quantity + " application(s) are sold to the client.");
    }
}
