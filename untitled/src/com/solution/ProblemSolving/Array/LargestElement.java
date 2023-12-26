package com.solution.ProblemSolving.Array;

import org.junit.Test;

public class LargestElement {

    @Test
    public void Test1(){
        int[] arr={1,3,4,6,3};
        int max=largestElement(arr,5);
        System.out.println(max);
    }
    static int largestElement(int[] arr, int n) {
        int Left=0;
        int Right=1;
        int MAX=Integer.MIN_VALUE;
        int MIN=Integer.MAX_VALUE;
        while (Left< arr.length){
            if(arr[Left]>MAX){
                MAX=arr[Left];
            }
            if(arr[Left]<MIN){
                MIN=arr[Left];
            }

            Left++;
        }
        System.out.println("MAX:::"+MAX+"  MIN   "+MIN);
       return MAX;
    }
}
