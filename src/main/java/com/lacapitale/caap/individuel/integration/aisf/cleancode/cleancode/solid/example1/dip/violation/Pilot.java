package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.solid.example1.dip.violation;

/**
 * Created by bsferreira on 17-04-2016.
 */
public class Pilot {

    private RacingCar vehicle;

    public Pilot(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
