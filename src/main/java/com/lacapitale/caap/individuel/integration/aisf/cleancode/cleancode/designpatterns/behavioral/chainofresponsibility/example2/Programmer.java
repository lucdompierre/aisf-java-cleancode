package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example2;

/**
 * @author eugenia
 */
class Programmer extends Employee {

    public Programmer(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Programmer is working on project: " + message);
    }
}
