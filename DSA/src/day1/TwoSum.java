package day1;
import org.junit.Test;
public class TwoSum {

    /*
    Given the input int array , find the indices of the matching 2 sum given the numbers.
   case Positive: int[] nums = {2,3,8,11,16,23};
    int a=4;
    int b=7;
    sum-> 11 (do 11 exist return indexies) else return sum don't exists.
    edge case : nums ={11,2,3,11,16,23}; return two indexies // ask about it
    negative case: {2,3,8,1,16,23}; return exception or -1
     */

/*
Given the input int array , find the indices of the matching given the target
int [] nums = {2,7,11,15}
int target =9
output --> {0,1}

int [] nums = {-2,7,11,15};
int target =9;
output --> {0,2}

int [] nums = {2,2,3,1,4,0,5}
int target = 5;

output --> {{0,2},{1,3},{3,4},{5,6}}
int[] nums = {2,7,9,11,15};
int target = 4;

output --> {0,0}
 */

@Test
    public void example1 (){
    int [] nums = {2,7,11,15};
    int target =9;
  //  twosum_twoPointer(nums,target);
    //output --> {0,1}
}
@Test
    public void example2 (){
    int [] nums = {2,2,3,1,4,0,5};
    int target = 5;
    twosum_twoPointer(nums,target);

    //output --> {{0,2},{1,3},{3,4},{5,6}}
    }
    @Test
    public void example3 (){
        int [] nums = {2,2,3,1,4,0,5};
        int target = 45;
        twosum_twoPointer(nums,target);

       // output --> {{0,2},{1,3},{3,4},{5,6}}
    }
private void twosum_BruteForce(int [] nums, int target)
{
    boolean bmatch = false;
  for(int i=0;i< nums.length;i++)
  {
      for(int j= i+1; j< nums.length ;j++)
      {
          if ((nums[i]+nums[j]) == target)
          {
           System.out.println(i+","+j);
              bmatch=true;
          }
      }
  }
  if(!bmatch)
  {
      throw new RuntimeException("no match found");
  }
}
private void twosum_twoPointer(int [] nums, int target){
int left = 0;
int right = nums.length-1;
int i=0;
boolean bmatch=false;
while(i < nums.length)
{

    if (nums[left]+nums[right] == target){
             System.out.println(left+","+right);
            bmatch=true;
           }
    i++;
}
}

}
