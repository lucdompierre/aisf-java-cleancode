package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.composite.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * The class is treated as a Composite
 *
 * @author eugenia
 */
class BankManager implements Employee {

    private int id;
    private String name;
    private double salary;

    public BankManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private List<Employee> employees = new ArrayList<Employee>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public Employee getChild(int i) {
        return employees.get(i);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("==========================");
        System.out.println("Id =" + getId());
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("==========================");

        System.out.println("Employees ==========================>");

        for (Employee employee : employees) {
            employee.print();
        }
    }
}
