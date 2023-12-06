package com.solution.Creation.Singleton;
//used to create only one instance of a class
public class Singleton {
    private static Singleton sigObject; //private static variable
    private Singleton(){ //private constructor

    }
    public static Singleton newInstance(){ //public static method which return instance of the class
       if(sigObject==null) {
           synchronized (Singleton.class) {
               if (sigObject == null) {
                   sigObject = new Singleton();
               }
           }
       }
        return sigObject;
    }
    synchronized public static Singleton newInstance1(){ //public static method which return instance of the class

                if (sigObject == null) {
                    sigObject = new Singleton();
                }

        return sigObject;
    }
     public static Singleton newInstance2(){ //public static method which return instance of the class

        if (sigObject == null) {
            sigObject = new Singleton();
        }

        return sigObject;
    }
}
