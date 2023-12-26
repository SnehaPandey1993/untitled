package com.solution.ProblemSolving.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Leader {
    @Test
    public void Test1(){
        int arr[]={10, 22, 12, 3, 0, 6};
       int[] max= lead(arr);
        System.out.println(Arrays.toString(max));

    }
    @Test
    public void Test2(){
        int arr[]={4, 7, 1, 0};
        int[] max= lead(arr);
        System.out.println(Arrays.toString(max));

    }
    private int[] lead(int[] arr) {
        int Left=arr.length-1,Right=arr.length-2;
        ArrayList<Integer> max=new ArrayList<>();
        int maxv=0;
        while (Left>0)
        {
            if (arr[Left]> maxv){
                maxv=arr[Left];
                max.add(maxv);

            }
            Left--;
        }
        Collections.reverse(max);

        return (max.stream().mapToInt(Integer::intValue).toArray());
    }
}
