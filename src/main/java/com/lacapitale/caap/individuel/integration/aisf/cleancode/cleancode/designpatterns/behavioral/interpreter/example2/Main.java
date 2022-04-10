package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example2;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {

        InterpreterClient client = new InterpreterClient();

        System.out.println("Result: " + client.interpret("add 15 and 25"));
        System.out.println();
        System.out.println("Result: " + client.interpret("multiply " + client.interpret("add 5 and 5") + " and 10"));
    }
}
