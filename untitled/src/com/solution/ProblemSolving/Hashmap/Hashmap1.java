package com.solution.ProblemSolving.Hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    @Test
    public void Test1(){
        int[] num={3,4,5,2};
        int max=maxProduct(num);
        System.out.println("Test ::"+max);
    }
    @Test
    public void Test2(){
        int[] num={3,7};
        int max=maxProduct(num);
        System.out.println("Test ::"+max);
    }
    private int maxProduct(int[] num) {
       int max1=0,max2=0;
       for (var val:num){

           if (val>max1){
               max2=max1;
               max1=val;
           }else if( val>max2){
               max2=val;
           }
       }
        return (max1-1)*(max2-1);
    }
    private int maxProduct1(int[] num) {
        int Left=0,Right=1;
        int max=0;
        while (Left<num.length){
            while (Right<num.length) {
                int value = ((num[Left] - 1) * (num[Right] - 1));
                if (value > max) {
                    max = value;
                }
                Right++;
            }
            Left++;
            Right=Left+1;
        }
        System.out.println(max);
        return max;
    }
}
