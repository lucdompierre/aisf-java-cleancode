package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example4;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }

}
