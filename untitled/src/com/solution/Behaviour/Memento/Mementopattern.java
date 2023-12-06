package com.solution.Behaviour.Memento;

public class Mementopattern {
    public static void main(String args[]){
        Originator org= new Originator();
        Caretaker ct=new Caretaker();
        org.setState("State#1");
        ct.add(org.saveStateToMemento());
        org.setState("State#2");
        ct.add(org.saveStateToMemento());
        org.setState("State#3");
        ct.add(org.saveStateToMemento());
        org.setState("State#4");
        ct.add(org.saveStateToMemento());

        System.out.println("initial state::::"+org.getState());
        org.getStateFromMemento(ct.get(0));
        System.out.println("first state::::"+org.getState());
        org.getStateFromMemento(ct.get(1));
        System.out.println("second state::::"+org.getState());
        org.getStateFromMemento(ct.get(2));
                System.out.println("third state::::"+org.getState());
        org.getStateFromMemento(ct.get(3));

    }
}
