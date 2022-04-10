package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example2;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example2.command.MakeCommand;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example2.command.SellCommand;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example2.reciever.Application;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {

        Application application = new Application();

        //wrapping requests
        MakeCommand makeCommand = new MakeCommand(application);
        SellCommand sellCommand = new SellCommand(application);

        // invoker
        Programmer programmer = new Programmer();
        programmer.takeOrder(makeCommand);
        programmer.takeOrder(sellCommand);

        // invoker processed the wrapped request
        programmer.placeOrders();
    }
}
