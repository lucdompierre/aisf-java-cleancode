package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example2;

/**
 * @author eugenia
 */
 class GamingComputer extends ComputerDecorator {

    public GamingComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding characteristics of a gaming computer. ");
    }
}
