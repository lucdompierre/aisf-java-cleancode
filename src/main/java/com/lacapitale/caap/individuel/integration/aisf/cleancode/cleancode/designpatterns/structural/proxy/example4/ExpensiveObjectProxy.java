package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example4;

/**
 * Class to utilize the Proxy pattern and initialize a heavy object on demand
 * We only want such objects toø be initialized on demand, and once they are, we’d want to reuse them for all calls
 *
 * @author eugenia
 */
class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject object;

    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
