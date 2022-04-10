package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.reciever;

/**
 * Receiver interface which implementations will actually do all the work.
 *
 * @author eugenia
 */
public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}
