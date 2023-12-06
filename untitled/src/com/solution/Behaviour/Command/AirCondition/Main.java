package com.solution.Behaviour.Command.AirCondition;

public class Main {
    public static void main(String args[]){
        MyRemoteControl myrc= new MyRemoteControl();
        AirConditioner ac=new AirConditioner();
        myrc.setCommandI(new TurnOnAC(ac));
        myrc.pressbuton();
        myrc.undo();
    }
}
