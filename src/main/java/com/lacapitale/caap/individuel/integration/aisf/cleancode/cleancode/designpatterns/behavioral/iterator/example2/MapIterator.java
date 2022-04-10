package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.iterator.example2;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.iterator.example2.map.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author eugenia
 */
class MapIterator implements Iterator<Direction> {

    private int index = -1;
    private Map m;

    MapIterator(Map m) {
        this.m = m;
    }

    public boolean hasNext() {
        switch (index) {
            case -1:
                return m.hasWest() || m.hasEast() || m.hasNorth() || m.hasSouth();
            case 0:
                return m.hasEast() || m.hasNorth() || m.hasSouth();
            case 1:
                return m.hasNorth() || m.hasSouth();
            case 2:
                return m.hasSouth();
            default:
                return false;
        }
    }

    public Direction next() {
        Direction direction;

        switch (index) {
            case -1:
                direction = defineNext(West.class, East.class, North.class, South.class);
                break;
            case 0:
                direction = defineNext(East.class, North.class, South.class);
                break;
            case 1:
                direction = defineNext(North.class, South.class);
                break;
            case 2:
                direction = defineNext(South.class);
                break;
            default:
                throw new NoSuchElementException();
        }
        return direction;

    }

    /**
     * Contains some logic to define next element from object fields, sets iterator index
     * and retrieves the next element
     *
     * @param a field types to check
     * @return {@link Direction}
     */
    private Direction defineNext(Class... a) {
        Direction result = null;

        for (Class d : a) {

            if (d.equals(West.class) && m.hasWest()) {
                index = 0;
                result = m.getWest();
                break;
            } else if (d.equals(East.class) && m.hasEast()) {
                index = 1;
                result = m.getEast();
                break;
            } else if (d.equals(North.class) && m.hasNorth()) {
                index = 2;
                result = m.getNorth();
                break;
            } else if (d.equals(South.class) && m.hasSouth()) {
                index = 3;
                result = m.getSouth();
                break;
            }
        }

        if (result == null) {
            throw new RuntimeException("Error. Result is not expected to be null");
        }

        return result;

    }

    public void remove() {
        switch (index) {
            case -1:
                throw new IllegalStateException();
            case 0:
                if (m.hasWest()) m.setWest(null);
                else throw new IllegalStateException();
                break;
            case 1:
                if (m.hasEast()) m.setEast(null);
                else throw new IllegalStateException();
                break;
            case 2:
                if (m.hasNorth()) m.setNorth(null);
                else throw new IllegalStateException();
                break;
            case 3:
                if (m.hasSouth()) m.setSouth(null);
                else throw new IllegalStateException();
                break;
            default:
                throw new NoSuchElementException();
        }

    }


}
