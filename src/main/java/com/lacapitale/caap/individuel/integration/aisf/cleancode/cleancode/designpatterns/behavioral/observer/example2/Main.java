package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.observer.example2;

/**
 * @author eugenia
 */
public class Main {


    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        new CEO(programmer);
        new Manager(programmer);
        new LeadProgrammer(programmer);

        System.out.println("Programmer successfully did his job!");
        programmer.setState("Successful");
        System.out.println("---");
        System.out.println("Programmer failed his new assignment.");
        programmer.setState("Failed");
    }
}
