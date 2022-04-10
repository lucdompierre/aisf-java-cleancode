package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example2;

/**
 * @author eugenia
 */
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCar;

    public MovableAdapterImpl(Movable luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCar.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
