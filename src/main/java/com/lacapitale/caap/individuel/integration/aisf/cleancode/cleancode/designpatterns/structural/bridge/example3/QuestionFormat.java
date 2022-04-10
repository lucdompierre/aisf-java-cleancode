package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.bridge.example3;

/**
 * @author eugenia
 */
class QuestionFormat extends QuestionManager {

    QuestionFormat(String catalog, Question q) {
        super(catalog, q);
    }

    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }

}
