package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example1.context;

import com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.state.example1.state.State;

/**
 * Context that also implements {@link State} and keep a reference of its current state
 * and forwards the request to the state implementation
 *
 * @author eugenia
 */
public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    /**
     * Forwards the request to the state implementation
     */
    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
