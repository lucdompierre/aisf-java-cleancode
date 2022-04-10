package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.iterator.example1;

/**
 * POJO for channel
 *
 * @author eugenia
 */
class Channel {

    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double freq, ChannelTypeEnum type) {
        this.frequency = freq;
        this.TYPE = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Frequency=" + this.frequency + ", Type=" + this.TYPE;
    }
}
