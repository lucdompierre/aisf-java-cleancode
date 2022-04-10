package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example1.isp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Car extends Vehicle implements RadioSwitch {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }

}