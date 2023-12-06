package com.solution.string;

public class IpAddress {
    public static String defangIPaddr(String address) {
        String ch="[.]";
       String add= address.replace(".",ch);
       // address.replace('.',ch);
        return add;
    }
    public static void main(String args[]){
        String say="1.1.1.1";
        String adder=defangIPaddr(say);
        System.out.println( "adder:::::"+adder);
    }
}
