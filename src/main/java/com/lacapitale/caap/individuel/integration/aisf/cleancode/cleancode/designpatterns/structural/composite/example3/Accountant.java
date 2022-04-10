package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.composite.example3;

/**
 * The class is treated as a leaf
 *
 * @author eugenia
 */
class Accountant implements Employee {

    private int id;
    private String name;
    private double salary;

    public Accountant(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        throw new UnsupportedOperationException("Method is not supported");
    }

    public Employee getChild(int i) {
        throw new UnsupportedOperationException("Method is not supported");
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
        System.out.println("=========================");
        System.out.println("Id =" + getId());
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("=========================");
    }

    public void remove(Employee employee) {
        throw new UnsupportedOperationException("Method is not supported");
    }

}
