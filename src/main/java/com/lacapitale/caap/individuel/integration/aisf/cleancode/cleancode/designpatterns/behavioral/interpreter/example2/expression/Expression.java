package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example2.expression;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.interpreter.example2.InterpreterEngine;

/**
 * Interface for expressions
 *
 * @author eugenia
 */
public interface Expression {

    int interpret(InterpreterEngine engine);
}
