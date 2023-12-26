package com.solution.Structure.FacadePattern;

public class Samsung implements Mobile{
    @Override
    public void modelNo() {
        System.out.println("Samsung Mobile");
    }

    @Override
    public void price() {
        System.out.println("Rs.37000");
    }
}
