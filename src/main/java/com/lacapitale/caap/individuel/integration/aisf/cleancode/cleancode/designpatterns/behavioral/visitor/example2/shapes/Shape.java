package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.visitor.example2.shapes;


import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.visitor.example2.visitor.Visitor;

/**
 * @author eugenia
 */
public interface Shape {

    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);

}
