package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example3.reciever;

/**
 * Document class that will act as a Receiver and do all the work
 *
 * @author eugenia
 */
public class Document {

    public void open() {
        System.out.println("Document Opened");
    }

    public void save() {
        System.out.println("Document Saved");
    }
}
