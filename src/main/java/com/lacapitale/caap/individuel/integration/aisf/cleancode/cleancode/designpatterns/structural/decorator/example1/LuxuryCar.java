package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example1;

/**
 * The Concrete Decorator extending the base decorator functionality and modifying the component behavior accordingly.
 *
 * @author eugenia
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }
}
