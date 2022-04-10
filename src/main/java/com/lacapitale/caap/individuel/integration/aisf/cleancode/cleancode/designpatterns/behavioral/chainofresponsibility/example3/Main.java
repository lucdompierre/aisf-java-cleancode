package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.chainofresponsibility.example3;

/**
 * @author eugenia
 */
public class Main {

    private static Logger doChaining(){
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUT_INFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERROR_INFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUG_INFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }
    public static void main(String args[]){
        Logger chainLogger= doChaining();

        chainLogger.logMessage(Logger.OUTPUT_INFO, "Enter the sequence of values ");
        System.out.println();
        chainLogger.logMessage(Logger.ERROR_INFO, "An error is occured now");
        System.out.println();
        chainLogger.logMessage(Logger.DEBUG_INFO, "This was the error now debugging is compeled");
    }
}
