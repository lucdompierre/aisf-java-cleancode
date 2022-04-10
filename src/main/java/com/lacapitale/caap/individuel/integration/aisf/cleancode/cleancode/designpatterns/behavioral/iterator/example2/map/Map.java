package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.iterator.example2.map;

/**
 * @author eugenia
 */
public class Map {

    private West west = new West();
    private East east = new East();
    private North north = new North();
    private South south = new South();

    public West getWest() {
        return west;
    }

    public void setWest(West rightWest) {
        this.west = rightWest;
    }

    public boolean hasWest() {
        return west != null;
    }

    public East getEast() {
        return east;
    }

    public void setEast(East east) {
        this.east = east;
    }

    public boolean hasEast() {
        return east != null;
    }

    public North getNorth() {
        return north;
    }

    public void setNorth(North north) {
        this.north = north;
    }

    public boolean hasNorth() {
        return north != null;
    }

    public South getSouth() {
        return south;
    }

    public void setSouth(South south) {
        this.south = south;
    }

    public boolean hasSouth() {
        return south != null;
    }
}

