package com.solution.Creation.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Engneeringbuilder extends StudentBuilder {
    @Override
    public StudentBuilder setsubject() {
        List<String> subs= new ArrayList<>();
        subs.add("IT");
        subs.add("cse");
        subs.add("ECE");
        this.subject=subs;
        return this;
    }
}
