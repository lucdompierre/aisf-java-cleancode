package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.composite.example1;

/**
 * Defines the behaviour for the elements in the composition.
 * It is the building block for the composition and implements base component.
 * It does not have references to other Components.
 *
 * @author eugenia
 */
class Triangle implements Shape {

    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }
}
