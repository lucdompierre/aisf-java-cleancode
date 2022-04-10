package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example2;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example2.expression.AddExpression;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example2.expression.Expression;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example2.expression.MultiplyExpression;

/**
 * @author eugenia
 */
public class InterpreterClient {

    private InterpreterEngine engine = new InterpreterEngine();

    public int interpret(String input) {
        Expression expression = null;

        if (input.contains("add")) {
            expression = new AddExpression(input);
        } else if (input.contains("multiply")) {
            expression = new MultiplyExpression(input);
        }

        int result = expression.interpret(engine);
        System.out.println(input);
        return result;
    }
}
