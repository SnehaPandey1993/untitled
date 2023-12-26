package com.solution.ProblemSolving.Array;

import org.junit.Test;

public class LinearSearch {
    @Test
    public void Test1(){
        int[] arr={1,3,4,6,3};
        int max=findElement(arr,4);
        System.out.println(max);
    }

    private int findElement(int[] arr, int num) {
        int Left=0,index=0;
        while(Left< arr.length){
            if(arr[Left]==num){
                index=Left;
            }
            Left++;
        }
        return index;
    }
}
