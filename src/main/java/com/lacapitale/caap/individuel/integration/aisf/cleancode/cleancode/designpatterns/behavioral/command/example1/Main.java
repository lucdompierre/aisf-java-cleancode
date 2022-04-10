package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.command.CloseFileCommand;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.command.OpenFileCommand;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.command.WriteFileCommand;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.reciever.FileSystemReceiver;
import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.command.example1.reciever.FileSystemReceiverUtil;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Creating invoker and associating with Command
        new FileInvoker(new OpenFileCommand(fs)).execute();
        new FileInvoker(new WriteFileCommand(fs)).execute();
        new FileInvoker(new CloseFileCommand(fs)).execute();

    }

}
