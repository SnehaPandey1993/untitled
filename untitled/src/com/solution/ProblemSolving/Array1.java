package com.solution.ProblemSolving;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Array1 {
    @Test
    public void test1(){
        int arr[]={1,1,2,2,3,3,3,3};
       int array= findSpecialInteger(arr);
        System.out.println("Test  1   :"+array);
    }
   @Test
    public void test2(){
        int arr[]={5668,5668,5668,5668,22011};
        int array= findSpecialInteger(arr);
        System.out.println("Test  2   :"+array);
    }

    @Test
    public void test3(){
        int arr[]={1,1};
        int array= findSpecialInteger(arr);
        System.out.println("Test  3   :"+array);
    }
/*     left=0
        1,2,2,6,6,6,6,7,10
      nofrepeat=arr.lenght*1/4
        right=0
        while
        1. if arr[left]==arr[right]
            count++
         2.if arr[left]!=arr[right]
             left++;
          3 if(left==right)
              key=left;
              value=count;
              left++;
              else right++

          3.
* */
    private int findSpecialInteger(int[] arr) {
        int count=1;
        int noofrepeat=arr.length*1/4;
        int Left=0;
        int Right=1;
        int exact=0;
        if(arr.length>1) {
            while (Right <= (arr.length - 1)) {
                if (arr[Left] == arr[Right]) {
                    count++;
                    Right++;
                } else {
                    Left = Right;
                    Right++;
                    count = 1;
                }
                if (count > noofrepeat) {
                    exact = arr[Left];
                }
            }
        }else {
            exact= arr[Left];
        }
        return exact;
    }
}
