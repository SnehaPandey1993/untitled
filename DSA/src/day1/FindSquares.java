package day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindSquares {

    /*
    Given sorted integer array in non-decreasing order,return the array of the squares of each number sorted in non-decreasing order
     */

    @Test
    public void example1 (){
        int [] nums = {1,2,3,4,5};
        //square_BruteForce(nums);
        Assert.assertArrayEquals(square_BruteForce(nums),new int[]{1,4,9,16,25});
        //output --> {1,4,9,16,25}
    }
    @Test
    public void example2 (){
        int [] nums = {-9,-6,-1,0,5,9};

        //output --> {{0,2},{1,3},{3,4},{5,6}}
    }
    @Test
    public void example3 (){
        int [] nums = {};


        // output --> {{0,2},{1,3},{3,4},{5,6}}
    }
    private int[] square_BruteForce(int [] nums)
    {
     for(int i=0;i< nums.length;i++)
     {
         nums[i]=nums[i]*nums[i];
     }
        Arrays.sort(nums);
     System.out.println(Arrays.toString(nums));
     return nums;
    }
    private void square_twoPointer(){

    }
}
