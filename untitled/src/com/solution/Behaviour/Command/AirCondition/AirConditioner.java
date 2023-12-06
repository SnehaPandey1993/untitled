package com.solution.Behaviour.Command.AirCondition;
//Reciever
public class AirConditioner {
    boolean ison;
    int temparature;
    public  void turnACon()
    {
        System.out.println("turn ON");
    }
    public void turnACoff()
    {
        System.out.println("turn OFF");
    }
    public void setTemparature(int temp){
        this.temparature=temp;
        System.out.println("temp:::::"+temparature);
    }
}
