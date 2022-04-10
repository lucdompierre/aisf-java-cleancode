package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.templatemethod.example2.employee;

/**
 * Defines a few shared employees responsibilities in a company
 *
 * @author eugenia
 */
public abstract class Employee {

    public final void comeToWork() {
        work();
        takePause();
        work();
        getPaid();
    }

    public abstract void work();
    public abstract void takePause();
    public abstract void getPaid();

}
