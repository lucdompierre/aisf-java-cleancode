package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.bridge.example3;

/**
 * Bridge class.
 * Class to manage questions
 *
 * @author eugenia
 */
class QuestionManager {

    private Question q;
    private String catalog;

    public QuestionManager(String catalog, Question q) {
        this.catalog = catalog;
        this.q = q;
    }

    public void next() {
        q.nextQuestion();
    }

    public void previous() {
        q.previousQuestion();
    }

    public void newOne(String q) {
        this.q.newQuestion(q);
    }

    public void delete(String q) {
        this.q.deleteQuestion(q);
    }

    public void display() {
        q.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        q.displayAllQuestions();
    }
}
