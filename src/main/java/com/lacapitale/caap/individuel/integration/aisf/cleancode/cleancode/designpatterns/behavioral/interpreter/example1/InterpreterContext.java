package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example1;

/**
 * Interpreter context class that will do the actual interpretation
 *
 * @author eugenia
 */
public class InterpreterContext {

    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}
