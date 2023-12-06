package com.solution.Behaviour.Interpretator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class InterpreterDesignP {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input=sc.next();

        Format format=new Format();
        format.setFormat(String.valueOf(format));
        format.setDate(new Date());
        ArrayList sort=getFormatorder(format);
        //AbstarctFormat abstarctFormat = null;
        for (int i=0;i<sort.size() ;i++){
            AbstarctFormat abstarctFormat=null;
            abstarctFormat.execute(format);
            System.out.println(abstarctFormat.getClass().getName()+"   "+format.getFormat());
        }
    }
    private static ArrayList getFormatorder(Format format){
        ArrayList sortedarray= new ArrayList();
        String[] data = format.getFormat().split("-");
        for(String str : data){
           if (str.equals("DD")){
               sortedarray.add(new DayFormat());
            }else if(str.equals("MM")){
               sortedarray.add(new MonthFormat());
            }else {
               sortedarray.add(new YearFormat());
           }
        }
        return sortedarray;
    }
}
