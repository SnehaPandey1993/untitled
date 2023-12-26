package com.solution.Structure.FlyWeight.Robot;

public class Main {
    public static void main(String args[]){
        IRobot humanid1=RobitFactory.createRobot("HUMANID");
        humanid1.display(2,3);
        IRobot humanid2=RobitFactory.createRobot("HUMANID");
        humanid2.display(12,10);
        IRobot dogid=RobitFactory.createRobot("DOGID");
        dogid.display(3,5);
        IRobot dogid2=RobitFactory.createRobot("DOGID");
        dogid2.display(13,15);
    }
}
