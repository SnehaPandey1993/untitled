package com.solution.Creation.FactoryPattern;

import com.solution.Creation.FactoryPattern.Circle;
import com.solution.Creation.FactoryPattern.FactoryPattern;
import com.solution.Creation.FactoryPattern.Reactangle;

public class Singlefactory {
    public FactoryPattern getinstance(String values)
    {
        if(values.equals("Circle"))
        {
           return (FactoryPattern) new Circle();
        } else if (values.equals("Reactangle")) {
            return (FactoryPattern) new Reactangle();
        }
        return null;
    }
}
