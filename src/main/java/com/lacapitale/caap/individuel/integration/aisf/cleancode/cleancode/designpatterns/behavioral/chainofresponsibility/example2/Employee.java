package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example2;

/**
 * Abstract class contains authority levels for all of the employees
 * A programmer is located less on the hierarchy than a lead programmer, which is in turn, lower than a manager.
 *
 * @author eugenia
 */
abstract class Employee {

    public static int PROGRAMMER = 1;
    public static int LEAD_PROGRAMMER = 2;
    public static int MANAGER = 3;

    protected int authorityLevel;

    protected Employee nextEmployee;

    /**
     * Sets a reference to the next employee
     *
     * @param employee employee
     */
    public void setNextEmployee(Employee employee) {
        this.nextEmployee = employee;
    }

    /**
     * Processes the request
     *
     * @param authorityLevel authority level
     * @param message        message
     */
    public void doWork(int authorityLevel, String message) {
        if (this.authorityLevel <= authorityLevel) {
            write(message);
        }
        if (nextEmployee != null) {
            nextEmployee.doWork(authorityLevel, message);
        }
    }

    abstract protected void write(String message);
}
