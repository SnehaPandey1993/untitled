package com.solution.Behaviour.Memento;

public class Originator{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Mementor saveStateToMemento() {
        return new Mementor(state);

    }


    public void getStateFromMemento(Mementor mementor) {
        state = mementor.getState();
    }
}
