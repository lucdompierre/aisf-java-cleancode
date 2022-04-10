package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.visitor.example1.visitor;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.visitor.example1.item.Book;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.visitor.example1.item.Fruit;


public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
