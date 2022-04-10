package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.templatemethod.example1.building;

/**
 * Defines the steps to execute an algorithm and it can provide default implementation that might be common for all or
 * some of the subclasses.
 *
 * @author eugenia
 */
public abstract class HouseTemplate {

    /**
     * Defines the order of execution for performing several steps to build a house
     * The template method is final so subclasses can't override
     */
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    /**
     * Default implementation to build windows
     */
    protected void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    protected abstract void buildWalls();

    protected abstract void buildPillars();

    /**
     * Default implementation to build foundation
     */
    protected void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}
