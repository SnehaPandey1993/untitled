package com.solution.Creation.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBABuilder extends StudentBuilder{
    @Override
    public StudentBuilder setsubject() {
        List<String> mba= new ArrayList<>();
        mba.add("MARKETING");
        mba.add("Finance");
        this.subject=mba;
        return this;
    }
}
