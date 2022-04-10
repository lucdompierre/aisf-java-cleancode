package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example2;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        Computer basicComputer = new BasicComputer();
        basicComputer.assemble();

        System.out.println("\n");

        Computer gamingComputer = new GamingComputer(new BasicComputer());
        gamingComputer.assemble();
        System.out.println("\n");

        Computer workComputer = new WorkComputer(new GamingComputer(new
                BasicComputer()));
        workComputer.assemble();
    }
}
