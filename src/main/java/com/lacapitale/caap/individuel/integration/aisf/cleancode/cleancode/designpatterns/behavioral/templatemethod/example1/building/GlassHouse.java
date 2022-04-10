package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.templatemethod.example1.building;

/**
 * Class to build a glass house
 *
 * @author eugenia
 */
public class GlassHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
