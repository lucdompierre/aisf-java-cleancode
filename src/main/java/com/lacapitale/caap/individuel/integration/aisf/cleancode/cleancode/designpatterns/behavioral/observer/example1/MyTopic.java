package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eugenia
 */
class MyTopic implements Subject {

    /**
     * A list of observers to notify of any change in it’s state
     */
    private List<Observer> observers;
    private String message;

    /**
     * Flag to keep track of the change in the state of topic and used in notifying observers
     * Being stored in main memory instead of copying the variable from main memory into a CPU cache
     */
    private volatile boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    /**
     * Registers observer
     *
     * @param obj {@link Observer}
     */
    public void register(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    /**
     * Unregisters observer
     *
     * @param obj {@link Observer}
     */
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    /**
     * Notifies all the observers of any change and either it can send the update while notifying the observer
     */
    public void notifyObservers() {
        List<Observer> observersLocal;
        /*synchronization is used to make sure the notification is sent only to the observers registered
        before the message is published to the topic*/
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }

    }

    /**
     * Gets update
     *
     * @param obj {@link Observer}
     * @return
     */
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    /**
     * Posts message to the topic
     *
     * @param msg message
     */
    public void postMessage(String msg) {
        // synchronize to notify all observers before new message is set
        synchronized (MUTEX) {
            System.out.println("Message Posted to Topic:" + msg);
            this.message = msg;
            this.changed = true;
            notifyObservers();
        }
    }
}
