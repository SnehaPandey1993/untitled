package com.solution.Structure.FacadePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int choice=0;
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        choice= Integer.parseInt(br.readLine());
        Facade fac= new Facade();
        switch (choice){
            case 1:{
                fac.blackberrySale();
            }break;
            case 2:{
                fac.iphoneSale();
            }break;
            case 3:{
                fac.samsungSale();
            }
            break;
        }
    }
}
