package com.solution.Structure.BridgePattern;

public class Main {
    public static void main(String args[]){
        LivingBeing obj=new Fish(new FishBreathing());
        obj.breatheProcess();;
    }
}
