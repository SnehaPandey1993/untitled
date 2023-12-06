package com.solution.Creation.AbstractFactoryPattern;

public class EconomicFactory implements AbstractFactory{
    @Override
    public Car newinstance(int price) {
        if(price<100000){
            return new Econimiccar1();
        } else if (price>100000) {
            return new Econimiccar2();
        }
        return null;
    }
}
