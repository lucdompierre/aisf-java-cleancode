package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.decorator.example1;

/**
 * Client program can create different kinds of Object at runtime and they can specify the order of execution too
 *
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {

        Car basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println("\n*****");

        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
