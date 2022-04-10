package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.composite.example1;

/**
 * The base component in the case it's the interface for all objects in the composition,
 * client program uses base component to work with the objects in the composition.
 * It can be an interface or an abstract class with some methods common to all the objects.
 *
 * @author eugenia
 */
interface Shape {

    void draw(String fillColor);
}
