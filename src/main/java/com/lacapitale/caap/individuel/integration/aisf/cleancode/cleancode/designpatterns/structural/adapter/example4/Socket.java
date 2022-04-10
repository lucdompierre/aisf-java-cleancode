package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example4;

/**
 * Producing constant volts of 120V
 *
 * @author eugenia
 */
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }

}
