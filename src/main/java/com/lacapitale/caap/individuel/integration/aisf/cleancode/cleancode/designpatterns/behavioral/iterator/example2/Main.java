package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.iterator.example2;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.iterator.example2.map.Map;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        // create a map
        Map map = new Map();

        // disable west
        map.setNorth(null);

        MapIterator iterator = new MapIterator(map);

        while (iterator.hasNext()) {

            System.out.println("\nIs any direction available? " + iterator.hasNext()); // true
            System.out.println("Next direction is " + iterator.next().getName());

        }
    }
}
