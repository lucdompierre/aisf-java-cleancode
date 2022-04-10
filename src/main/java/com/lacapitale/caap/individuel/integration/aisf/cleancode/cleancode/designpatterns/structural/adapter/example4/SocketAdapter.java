package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.adapter.example4;

/**
 * General interface that will be used by client
 *
 * @author eugenia
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
