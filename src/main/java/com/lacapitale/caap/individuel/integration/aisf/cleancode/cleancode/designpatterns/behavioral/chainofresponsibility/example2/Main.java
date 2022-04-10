package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example2;

/**
 * @author eugenia
 */
public class Main {

    private static Employee getChainOfEmployees() {
        Employee programmer = new Programmer(Employee.PROGRAMMER);
        Employee leadProgrammer = new LeadProgrammer(Employee.LEAD_PROGRAMMER);
        Employee manager = new Manager(Employee.MANAGER);

        programmer.setNextEmployee(leadProgrammer);
        leadProgrammer.setNextEmployee(manager);

        return programmer;
    }

    public static void main(String[] args) {
        Employee employeeChain = getChainOfEmployees();

        employeeChain.doWork(Employee.PROGRAMMER, "This is basic programming work.");
        System.out.println();
        employeeChain.doWork(Employee.LEAD_PROGRAMMER, "This is marginally more sophisticated programming work.");
        System.out.println();
        employeeChain.doWork(Employee.MANAGER, "This is the work for a manager.");
    }

}
