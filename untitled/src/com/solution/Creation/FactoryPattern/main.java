package com.solution.Creation.FactoryPattern;

import com.solution.Creation.FactoryPattern.Circle;
import com.solution.Creation.FactoryPattern.Reactangle;
import com.solution.Creation.FactoryPattern.Singlefactory;
import com.solution.Creation.Singleton.Singleton;

public class main {
    public static void main(String args[]) {
        Singleton sig = Singleton.newInstance();
        Singleton sig1 = Singleton.newInstance();
        Singleton sig2 = Singleton.newInstance2();
        Singleton sig3 = Singleton.newInstance2();
        System.out.println(sig);
        System.out.println(sig1);
        System.out.println(sig2);

        Singlefactory sfobj=new Singlefactory();
        Circle cobj= (Circle) sfobj.getinstance("Circle");
        cobj.computerArea();
        Reactangle robj= (Reactangle) sfobj.getinstance("Reactangle");
        robj.computerArea();
    }
}
