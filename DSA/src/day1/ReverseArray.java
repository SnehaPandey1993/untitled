package day1;

import org.junit.Test;

import java.util.Arrays;

public class ReverseArray {

    @Test
    public void test1(){
        int[] arr = {1,2,3,4};

        firstApproach(arr);
        secondApproach(arr);

    }

    private void secondApproach(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int temp = 0;

        while(start < end){

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private void firstApproach(int[] arr) {

        int i=0;
        int swap = 0;
        while (i<(arr.length/2))
        {
            swap=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=swap;
            i++;
        }
        System.out.println(Arrays.toString(arr));

    }

}
