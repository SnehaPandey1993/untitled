package com.solution.ProblemSolving.Map;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap1 {
    @Test
    public void Test1(){

    }
    public static void main(String args[]){
       // Map<String,String> hm1=new HashMap<String,String>();
        Map<String,Customer> hm1=new ConcurrentHashMap<>();
       // Map<Integer,String>
       //  Map<String,String> hm1=new LinkedHashMap<>();
      //  Map<String,String> hm1=new TreeMap<>();
        Customer cus1=new Customer(1101,"Sneha",23000);
        Customer cus2=new Customer(1102,"Rahul",24000);
        Customer cus3=new Customer(1103,"Pandey",25000);
        Customer cus4=new Customer(1104,"Latha",26000);
        hm1.put("1",cus1);
        hm1.put("2",cus2);
        hm1.put("3",cus3);
        hm1.put("4",cus4);

        System.out.println(" Map iteration  ");

        System.out.println(" "+hm1);


        for(Map.Entry<String,Customer> m: hm1.entrySet()){
              Customer cust=  m.getValue();
                System.out.println(" Map get Key   " + m.getKey() + " Map Value "+cust.getName()+ " "+cust.getEmpid()+" "+cust.getSalary());

           // hm1.put("5","null");
        }

    }

}
