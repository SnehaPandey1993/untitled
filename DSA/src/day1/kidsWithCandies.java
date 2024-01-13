package day1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    @Test
    public void example1 (){
        int extraCandies = 3;
        int[] candies = {2,3,5,1,3};
        kidsWithCandies_BruteForce(candies,extraCandies);
        //System.out.println(kidswithCandies_Rahul(candies, extraCandies));
       // System.out.println(kidsWithCandies_BruteForce(candies,extraCandies));
        // Assert.assertEquals(k,5);
        //int target =9;
        //output --> {0,1}
    }
    private List<Boolean> kidsWithCandies_BruteForce(int[] candies, int extraCandies) {
        int left=0;
        int right=0;
        int i=0;
        List<Boolean> output = new ArrayList<Boolean>();

        while (right < candies.length){
              boolean flag= true;
              int total=candies[left]+extraCandies;
              if(total < candies[right]){
                  if(left != right)
                  flag=false;
              }else {
                  if(left == candies.length-1 && right == candies.length-1)
                  {
                      break;
                  } else if (left == candies.length-1) {
                     right++;
                  }else {
                      left++;
                  }

              }

            output.add(flag);
              total-=extraCandies;
        }
        System.out.println(output);
     return output;
    }

    public List<Boolean> kidswithCandies_Rahul(int[] candies, int extraCandies) {

        List<Boolean> output = new ArrayList<Boolean>();

        int totalCandies = extraCandies;

        for (int i = 0; i < candies.length; i++) {

            boolean flag = true;

            totalCandies += candies[i];

            for (int j = 0; j < candies.length; j++) {
                if (j != i) {
                    if (totalCandies < candies[j]) flag = false;
                }
            }
            output.add(flag);
            totalCandies -= candies[i];
        }
        return output;
    }
}
