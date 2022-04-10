package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example2.state;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example2.context.Context;

/**
 * Concrete State Implementation
 *
 * @author eugenia
 */
public class ApplicationFinish implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the finished state of development.");
        context.setState(this);
    }

    public String toString() {
        return "Finished state.";
    }
}
