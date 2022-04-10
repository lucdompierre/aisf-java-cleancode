package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.observer.example1;

/**
 * Contract for Observer,
 *
 * @author eugenia
 */
interface Observer {

    /**
     * Updates the observer, used by subject, notifies subject of any updates
     */
    void update();

    /**
     * Attaches with subject to observe
     *
     * @param sub {@link Subject}
     */
    void setSubject(Subject sub);
}
