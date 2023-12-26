package com.solution.Structure.DecoratorPattern;

public class Main {
    public static void main(String arg[]){
        BasePizza basePizza=new FarmhousePizza();
        BasePizza b1=new ExtraChesse(basePizza);
        System.out.println(b1.cost());

    }
}
