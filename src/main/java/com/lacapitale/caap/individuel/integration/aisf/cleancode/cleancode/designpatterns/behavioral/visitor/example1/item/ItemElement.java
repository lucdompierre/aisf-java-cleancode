package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.visitor.example1.item;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.visitor.example1.visitor.ShoppingCartVisitor;

/**
 * @author eugenia
 */
public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
