package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.command;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.reciever.FileSystemReceiver;

/**
 * @author eugenia
 */
public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    /**
     * Open command is forwarding request to openFile method
     */
    @Override
    public void execute() {
        this.fileSystem.openFile();
    }
}
