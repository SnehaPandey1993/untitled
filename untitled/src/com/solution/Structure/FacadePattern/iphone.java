package com.solution.Structure.FacadePattern;

public class iphone implements Mobile{
    @Override
    public void modelNo() {
        System.out.println("IPhone Mobile");
    }

    @Override
    public void price() {
        System.out.println("Rs.45000");

    }
}
