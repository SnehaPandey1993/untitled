package com.solution.Behaviour.Mediator;

public class Main {
    public static void main(String args[]){
        MediaterI mi=new Auctor();
        Customer bidder1=new Bider("AA", (Auctor) mi);
        Customer bidder2=new Bider("AB", (Auctor) mi);
        bidder2.placebid(13456);
        bidder2.placebid(78990);
        bidder1.placebid(18990);
    }
}
