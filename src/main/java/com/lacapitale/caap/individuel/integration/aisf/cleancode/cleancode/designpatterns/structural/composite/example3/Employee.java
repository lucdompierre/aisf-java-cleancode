package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.composite.example3;

/**
 * Employee interface i.e. Component
 * <p>
 * What component does:
 * - Declares interface for objects in composition.
 * - Implements default behavior for the interface common to all classes as appropriate.
 * - Declares an interface for accessing and managing its child components.
 *
 * @author eugenia
 */
interface Employee {

    int getId();

    String getName();

    double getSalary();

    void print();

    void add(Employee employee);

    void remove(Employee employee);

    Employee getChild(int i);

}
