package com.solution.Behaviour.Mediator;

public class Bider implements Customer{
    Auctor auctor;


    String name;
    public Bider(String name,Auctor auctor) {
        this.name = name;
        this.auctor = auctor;
        auctor.addcustomer(this);
    }

    @Override
    public void placebid(int amount) {
        auctor.placebider(amount,this);

    }

    @Override
    public void getnotification(int amount) {
        System.out.println("the bider is ::::"+name+"::::with amount::::"+amount);
    }

    @Override
    public String getname() {
        return name;
    }
}
