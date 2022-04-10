package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example2.command;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example2.reciever.Application;

/**
 * @author eugenia
 */
public class MakeCommand implements Order {

    private Application application;

    public MakeCommand(Application application) {
        this.application = application;
    }

    @Override
    public void placeOrder() {
        application.make();
    }
}
