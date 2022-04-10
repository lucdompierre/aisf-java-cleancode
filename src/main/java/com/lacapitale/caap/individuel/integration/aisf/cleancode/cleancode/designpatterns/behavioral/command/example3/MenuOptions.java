package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example3;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example3.command.ActionListenerCommand;

/**
 * Invoker object to which requests are sent
 *
 * @author eugenia
 */
class MenuOptions {

    private ActionListenerCommand clickOpenCommand;
    private ActionListenerCommand clickSaveCommand;

    MenuOptions(ActionListenerCommand clickOpenCommand, ActionListenerCommand clickSaveCommand) {
        this.clickOpenCommand = clickOpenCommand;
        this.clickSaveCommand = clickSaveCommand;
    }

    public void clickOpen() {
        clickOpenCommand.execute();
    }

    public void clickSave() {
        clickSaveCommand.execute();
    }
}
