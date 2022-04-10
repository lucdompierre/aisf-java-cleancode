package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example1;

/**
 * Decorator.
 * The class implements the component interface (or abstract class) and it has a HAS-A relationship with the component interface.
 * The component variable should be accessible to the child decorator classes, so {@link this#car} variable is protected.
 *
 * @author eugenia
 */
class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    public void assemble() {
        this.car.assemble();
    }
}
