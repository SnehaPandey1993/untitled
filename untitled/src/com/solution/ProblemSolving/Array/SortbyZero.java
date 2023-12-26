package com.solution.ProblemSolving.Array;

import com.solution.Structure.AdapterPattern.Adaptee.WeightingMachine;
import org.junit.Test;

import java.util.Arrays;

public class SortbyZero {
    @Test
    public void Test1(){
        int[] arr={0,0,0,0,0,0,1,1,1};
        int n=9;
      int[] aa=moveZeros(n, arr);
        System.out.println(" sort array by zero "+ Arrays.toString(aa));
    }
    public static int[] moveZeros(int n, int []a) {
        int Right = -1;
        //place the pointer j:
        for (int Left = 0; Left < n; Left++) {
            if (a[Left] == 0) {
                Right= Left;
                break;
            }
        }

        //no non-zero elements:
        if (Right == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int Left = Right+1; Left < n; Left++) {
            if (a[Left] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[Left];
                a[Left] = a[Right];
                a[Right] = tmp;
                Right++;
            }
        }
        return a;
    }

    private int[] zeroAtEnd(int[] arr) {
        int Left=0, Right=arr.length;
        int[] temp= new int[arr.length];

        for (int k=0;k<arr.length;k++)
        {
            int count=0;
            if(arr[k]==0){
                count++;
                callrecur(arr,k,count);

            }else if((k>0&&arr[k-1]==0)){
                count++;
                callrecur(arr,k-1,count);
            }

        }

        return arr;
    }

    private void callrecur(int[] arr, int Left, int right) {
         while (Left < arr.length - 1) {
           int temp = arr[Left];
            arr[Left] = arr[++Left];
            arr[Left] = temp;
        }


    }
}
