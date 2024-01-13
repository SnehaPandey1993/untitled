package day1;

import org.junit.Test;

public class finalValueAfterOperations {

    @Test
    public void example1 (){
        String[] nums = {"--X","X++","X++"};
         finalValueAfterOperations_BruteForce(nums);
       // Assert.assertEquals(k,5);
        //int target =9;
        //output --> {0,1}
    }
    private int finalValueAfterOperations_BruteForce(String [] operations)
    {
        int sum1=0;int sum=0;
        for(int i=0;i< operations.length;i++){
            String data=operations[i];
            if(data == "--X"|| data == "X--")
            {
                sum=-1;
            }else
            {
                sum=1;
            }
            //System.out.println((data));
            sum1=sum1+sum;

        }
        System.out.println((sum1));
        return sum1;
    }

}
