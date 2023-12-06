package com.solution.Creation.Singleton;

import com.solution.Creation.Prototype.Student;

public class main {
    public static void main(String args[]) {
        Singleton sig = Singleton.newInstance();
        Singleton sig1 = Singleton.newInstance();
        Singleton sig2 = Singleton.newInstance2();
        Singleton sig3 = Singleton.newInstance2();
        System.out.println(sig);
        System.out.println(sig1);
        System.out.println(sig2);



    }
}
