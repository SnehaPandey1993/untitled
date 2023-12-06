package com.solution.Creation.AbstractFactoryPattern;

public class Abstractfactoryproducer {

    public AbstractFactory newinstance(String value){
        if(value.equals("basic")){
            return  new EconomicFactory();
        } else if (value.equals("premium")) {
            return new LuxuryFactory();
        }
        return null;
    }
}
