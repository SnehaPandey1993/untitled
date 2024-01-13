package day1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class canBeIncreasing {
    @Test
    public void example1 (){
        int [] nums = {1,2,10,5,7};
        boolean k= canBeIncreasing_BruteForce(nums);
       // Assert.assertEquals(k,5);
        //int target =9;
        //output --> {0,1}
    }

    private boolean canBeIncreasing_BruteForce(int [] nums)
    {
        int count=0;
        List<Integer> od= new ArrayList<Integer>();
        for(int i=0;i< nums.length;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                    if(nums[i]<nums[j]&& nums[j]<nums[j+1])
                    {
                      break;

                    }else {
                        if (nums[i] >= nums[j]) {
                            od.add(nums[j]);
                        }
                        if (nums[j] >= nums[j + 1]) {
                            od.add(nums[j]);

                        }
                    }



            }
        }
System.out.println(od);
       if(od.stream().count() >1|| od.contains(1))
        {
            return false;
        }else
        {
            return true;
        }

    }
}
