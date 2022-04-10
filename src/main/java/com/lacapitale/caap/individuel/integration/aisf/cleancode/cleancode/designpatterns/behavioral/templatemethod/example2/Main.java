package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.templatemethod.example2;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.templatemethod.example2.employee.Employee;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.templatemethod.example2.employee.Manager;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.templatemethod.example2.employee.Programmer;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        Employee employee = new Programmer();
        System.out.println("A programmer has came to work...");
        employee.comeToWork();

        System.out.println();

        employee = new Manager();
        System.out.println("A manager has came to work...");
        employee.comeToWork();
    }
}
