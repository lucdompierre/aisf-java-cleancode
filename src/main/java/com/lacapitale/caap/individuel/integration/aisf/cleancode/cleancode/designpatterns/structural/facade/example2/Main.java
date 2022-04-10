package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.facade.example2;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.facade.example2.zoo.ZooKeeper;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();

        zookeeper.feedLion();
        zookeeper.feedWolf();
        zookeeper.feedBear();
    }
}
