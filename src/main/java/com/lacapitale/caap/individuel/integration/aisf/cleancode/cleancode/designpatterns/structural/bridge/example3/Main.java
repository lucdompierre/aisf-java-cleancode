package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.bridge.example3;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {

        //create a catalog
        QuestionFormat questions = new QuestionFormat("Java Programming Language", new JavaQuestions());

        questions.delete("what is class?");

        questions.display();

        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");

        questions.displayAll();
    }
}
