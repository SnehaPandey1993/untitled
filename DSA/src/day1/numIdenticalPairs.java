package day1;

import org.junit.Test;

public class numIdenticalPairs {
    @Test
    public void example1 (){
        int[] nums = {1,2,3,1,1,3};
        numIdenticalPairs_BruteForce(nums);
        // Assert.assertEquals(k,5);
        //int target =9;
        //output --> {0,1}
    }
    private int numIdenticalPairs_BruteForce(int [] nums)
    {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                {
                    n++;
                }
            }
        }
        System.out.println(n);
        int goodpair=n*(n-1)/2;

        return goodpair;
    }
}
