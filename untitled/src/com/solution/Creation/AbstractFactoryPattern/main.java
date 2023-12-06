package com.solution.Creation.AbstractFactoryPattern;

public class main {
    public static void main(String args[]){
        Abstractfactoryproducer afpobj= new Abstractfactoryproducer();
        AbstractFactory af=afpobj.newinstance("basic");
        Car cid=af.newinstance(300000);
        System.out.println(cid.speed());

    }
}
