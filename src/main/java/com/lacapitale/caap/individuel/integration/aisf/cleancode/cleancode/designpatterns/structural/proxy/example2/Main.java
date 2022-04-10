package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example2;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        MediaFile mediaFile = new ProxyMediaFile("movie.mp4");

        mediaFile.printName();
    }
}
