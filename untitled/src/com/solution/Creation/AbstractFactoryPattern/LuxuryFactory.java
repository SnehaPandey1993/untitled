package com.solution.Creation.AbstractFactoryPattern;

public class LuxuryFactory implements AbstractFactory {
    @Override
    public Car newinstance(int price) {
        if(price<2000000){
            return new Luxurycar1();
        } else if (price>2000000) {
            return new Luxurycar2();
        }
        return null;
    }
}
