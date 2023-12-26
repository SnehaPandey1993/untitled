package com.solution.ProblemSolving.Array;

import org.junit.Test;

import java.util.Arrays;

public class LeftRotatebyOne {
    @Test
    public void Test1(){
        int[] arr={1,3,4,6,3};
        int n=3;
        int[] max=leftRotate(arr,n);
        System.out.println(Arrays.toString(max));
    }

    private int[] leftRotate(int[] arr,int n) {
        int temp=0;
        int Left=0;
        if(n>arr.length) {
             n = n % arr.length;
        }
        while (n>0) {
            while (Left < arr.length - 1) {
                temp = arr[Left];
                arr[Left] = arr[++Left];
                arr[Left] = temp;
            }
            n--;
             temp=0;
             Left=0;
        }
        return arr;
    }
}
