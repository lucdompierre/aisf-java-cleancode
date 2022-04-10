package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.mediator.example2;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        DesktopColleague desktop = new DesktopColleague(mediator);

        MobileColleague mobile = new MobileColleague(mediator);

        mediator.addColleague(desktop);
        mediator.addColleague(mobile);

        desktop.send("Hello World");

        mobile.send("Hello");
    }
}
