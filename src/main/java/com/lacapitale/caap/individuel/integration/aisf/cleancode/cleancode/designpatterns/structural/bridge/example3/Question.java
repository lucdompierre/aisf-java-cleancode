package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.bridge.example3;

/**
 * Interface that provides the navigation from one question to another or vice-versa.
 *
 * @author eugenia
 */
interface Question {

    void nextQuestion();

    void previousQuestion();

    void newQuestion(String q);

    void deleteQuestion(String q);

    void displayQuestion();

    void displayAllQuestions();
}
