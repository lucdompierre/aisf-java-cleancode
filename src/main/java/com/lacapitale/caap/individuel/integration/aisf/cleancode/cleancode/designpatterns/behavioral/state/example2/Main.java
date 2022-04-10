package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example2;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example2.context.Context;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example2.state.ApplicationFinish;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example2.state.ApplicationStart;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        ApplicationStart start = new ApplicationStart();
        start.doAction(context);

        System.out.println(context.getState());

        ApplicationFinish finish = new ApplicationFinish();
        finish.doAction(context);

        System.out.println(context.getState());
    }
}
