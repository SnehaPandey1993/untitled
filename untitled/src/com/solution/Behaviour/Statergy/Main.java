package com.solution.Behaviour.Statergy;

public class Main {
    public static void main(String args[]){
        StrategyPattern sp=new StrategyPattern(new Addition());
        System.out.println("Addition:::::"+sp.executeStrategy(5,6));
         sp=new StrategyPattern(new Subtraction());
        System.out.println("Subtraction:::::"+sp.executeStrategy(5,6));
          sp=new StrategyPattern(new Multiplication());
        System.out.println("Multiplication:::::"+sp.executeStrategy(5,6));
        sp=new StrategyPattern(new Divide());
        System.out.println("Divide:::::::"+sp.executeStrategy(5,6));
    }
}
