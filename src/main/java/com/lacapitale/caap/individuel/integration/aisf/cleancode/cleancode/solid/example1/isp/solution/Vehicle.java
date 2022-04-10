package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example1.isp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public abstract class Vehicle implements EngineSwitch {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }

}