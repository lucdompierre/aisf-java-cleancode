package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example1;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String args[]) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpreterClient ec = new InterpreterClient();

        System.out.println(str1 + " = " + ec.interpret(str1));
        System.out.println(str2 + " = " + ec.interpret(str2));

    }
}
