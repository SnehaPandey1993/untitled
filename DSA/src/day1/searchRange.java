package day1;

import org.junit.Test;

import java.util.Arrays;

public class searchRange {
    @Test
    public void test1() {

        int[] arr = {1,1,1};
        int target=1;
        System.out.println(Arrays.toString(searchindex(arr,target)));
    }
    public  int[] searchindex(int[] nums,int target) {

        int[] value=new int[2];
        int left = 0;
        int rightend = nums.length;
        int mid = left + rightend / 2;
         int i=0;
        if(nums.length>2) {
            value= match(nums,target,left);
       // value= match(nums,target,mid);
        }else if(nums.length ==2 ) {
            if(nums[0]== target && nums[1]==target){
                value[0]=0;value[1]=1;
          } else if (nums[0]== target && nums[1]!=target) {
                value[0]=0;value[1]=0;

            } else if (nums[0]!= target && nums[1]==target) {
                value[0]=1;value[1]=1;

            }else {value[0]=-1;value[1]=-1;}
        }else if(nums.length==1){
            if(nums[0]== target){
                value[0]=0;value[1]=0;
            }else{ value[0]=-1;value[1]=-1;}
        }else{
            value[0]=-1;value[1]=-1;
        }



        return value;
    }
    public int[] match(int[] nums,int target, int mid)
    {
        int count=0;
        int[] values=new int[2];int i=0;int end=0;
        while (i<2) {
            while (mid < nums.length) {
                if (nums[mid] == target) {
                    count++;
                    if(mid==0||(nums[mid] !=nums[mid-1])) {
                        values[0] = mid;

                    }
                    end=mid;
                }
                mid+=1;
            }
            i++;

        }
        values[1]=end;
        if(count==1){
            values[1]=values[0];
        }else if(count==0){
            values[0]=-1;
            values[1]=-1;
         }
        return values;
    }

}
