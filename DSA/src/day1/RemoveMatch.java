package day1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveMatch {
    @Test
    public void example1 (){
        int [] nums = {1,2,3,4,5};
        int target =3;

        Assert.assertArrayEquals(remove_BruteForce(nums,target),new int[]{1,2,4,5});
        //output --> {1,2,4,5}
    }
    @Test
    public void example2 (){
        int [] nums = {-9,-6,-1,0,5,9};

    }
    @Test
    public void example3 (){
        int [] nums = {};

    }
    private int[] remove_BruteForce(int [] nums, int target)
    {
        List<Integer> sortlist= new ArrayList();
        for(int i=0;i< nums.length;i++)
        {
                        if(nums[i] !=target )  sortlist.add(nums[i]);

        }

        System.out.println(sortlist);
        int[] output = new int[sortlist.size()];
        for(int i=0; i< sortlist.size();i++)
        {
            output[i] =sortlist.get(i);
        }
        return output;
    }
    private void remove_twoPointer(){

    }
}
