package com.solution.Structure.FacadePattern;

public class Facade {
    private Mobile blackberry;
    private Mobile iphone;
    private Mobile samsung;

    public Facade() {
        blackberry=new Blackberry();
        iphone = new iphone();
        samsung=new Samsung();
    }

    public void blackberrySale()
    {
        blackberry.modelNo();
        blackberry.price();;
    }
    public void iphoneSale()
    {
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale()
    {
        samsung.modelNo();
        samsung.price();
    }
}
