package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example2;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(new BugattiVeyron());
        MovableAdapter bugattiChironAdapter = new MovableAdapterImpl(new BugattiChiron());
        System.out.println("Bugatti Veyron speed " + bugattiVeyronAdapter.getSpeed());
        System.out.println("Bugatti Chiron speed " + bugattiChironAdapter.getSpeed());
    }
}
