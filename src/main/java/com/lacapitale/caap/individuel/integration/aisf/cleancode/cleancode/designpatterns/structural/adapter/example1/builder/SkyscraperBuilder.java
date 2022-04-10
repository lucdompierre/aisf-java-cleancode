package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example1.builder;

/**
 * @author eugenia
 */
class SkyscraperBuilder implements Builder {

    public void build(String location) {
        System.out.println("Building a skyscraper in the " + location + "area!");
    }
}
