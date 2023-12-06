package com.solution.Behaviour.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Auctor implements MediaterI{
    List<Customer> cust= new ArrayList<>();
    @Override
    public void placebider(int amount, Bider candidate) {
       for (Customer customer:cust){
           if(!candidate.getname().equals(customer.getname())){
               customer.getnotification(amount);
           }
       }
    }

    @Override
    public void addcustomer(Bider customer) {
        cust.add(customer);
    }
}
