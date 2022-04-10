package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example1;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example1.expression.Expression;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example1.expression.IntToBinaryExpression;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example1.expression.IntToHexExpression;

/**
 * Client application that have the logic to parse the user input and pass it to correct expression
 *
 * @author eugenia
 */
class InterpreterClient {

    private InterpreterContext ic = new InterpreterContext();

    public String interpret(String str) {
        Expression exp;
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else return str;

        return exp.interpret(ic);
    }
}
