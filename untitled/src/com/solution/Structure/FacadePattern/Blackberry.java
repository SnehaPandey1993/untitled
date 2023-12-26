package com.solution.Structure.FacadePattern;

public class Blackberry implements Mobile{
    @Override
    public void modelNo() {
        System.out.println("BLACKBERRY Mobile");
    }

    @Override
    public void price() {
        System.out.println("Rs.27000");

    }
}
