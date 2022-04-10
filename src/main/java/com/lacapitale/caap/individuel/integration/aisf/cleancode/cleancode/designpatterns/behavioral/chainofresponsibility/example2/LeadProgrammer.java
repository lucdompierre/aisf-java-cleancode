package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example2;

/**
 * @author eugenia
 */
class LeadProgrammer extends Employee {

    public LeadProgrammer(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Lead programmer is working on project: " + message);
    }
}
