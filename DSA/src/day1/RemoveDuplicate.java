package day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    /*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     */
/*
Given the input int array , find the indices of the matching given the target
int [] nums = {2,7,11,15}
int target =9
output --> {0,1}

 */
    @Test
    public void example1 (){
        int [] nums = {-1,0,0,0,0,3,3};
        int k= remove_BruteForce(nums);
        Assert.assertEquals(k,5);
        //int target =9;
        //output --> {0,1}
    }
    private int remove_BruteForce(int [] nums)
    {
        List<Integer> dup = new ArrayList<>();
        int count=0;
            for(int j= count+1; j< nums.length;j++)
            {
                if (nums[count]==nums[j])
                {
                   continue;
                }
                else {
                    int val = nums[j];
                    if(Arrays.stream(dup.toArray()).anyMatch((d->d.equals(val))))
                    {
                        continue;
                    }else {
                        nums[count + 1] = nums[j];
                        dup.add(nums[count + 1]);
                        count++;
                    }
                }
        }
        System.out.println(Arrays.toString(nums));
        return count+1;
    }

}
