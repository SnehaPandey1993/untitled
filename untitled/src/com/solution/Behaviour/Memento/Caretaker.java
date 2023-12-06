package com.solution.Behaviour.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Mementor> mementor= new ArrayList<Mementor>();
    public void add(Mementor state){
        mementor.add(state);
    }
    public Mementor get(int Index){
        return mementor.get(Index);
    }
}
