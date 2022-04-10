package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.bridge.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements Question interface
 *
 * @author eugenia
 */
class JavaQuestions implements Question {

    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    JavaQuestions() {
        questions.add("What is class? ");
        questions.add("What is interface? ");
    }

    public void nextQuestion() {
        if (current <= questions.size() - 1) {
            current++;
        }
        System.out.print(current);
    }

    public void previousQuestion() {
        if (current > 0) {
            current--;
        }
    }

    public void newQuestion(String quest) {
        questions.add(quest);
    }

    public void deleteQuestion(String quest) {
        questions.remove(quest);
    }

    public void displayQuestion() {
        System.out.println(questions.get(current));
    }

    public void displayAllQuestions() {
        for (String quest : questions) {
            System.out.println(quest);
        }
    }
}
