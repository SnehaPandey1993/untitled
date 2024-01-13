package day1;

import org.junit.Test;

public class searchindex {
    @Test
    public void test1() {

        int[] arr = {15,16,19,20,25,1,3,4,5,7,10,14};
        int target=25;
        System.out.println(searchindex(arr,target));
    }
    public  int searchindex(int[] nums,int target) {

        int value=-1;
        int left = 0;
        int rightend = nums.length - 1;
        int mid = left + rightend / 2;

            if(nums.length>1) {
                if (nums[mid] == target) {
                    value = mid;
                    return mid;

                } else {

                    int leftend = mid - 1;
                    int right = mid + 1;
                    int leftmid = (left + leftend) / 2;
                    int rightmid = (right + rightend) / 2;

                    value = match(nums, target, leftmid);
                    if (value == -1) {

                        leftmid = (left + 1 + leftend) / 2;
                        value = match(nums, target, leftmid);
                        if(leftmid>0 && leftmid<mid && value == -1){
                            while (leftmid<mid) {
                               value = match(nums, target, ++leftmid);
                               if(value!=-1){break;}
                            }
                        }
                    }
                    if (value == -1) {
                        leftmid = (left + leftmid - 1) / 2;
                        value = match(nums, target, leftmid);
                        if(leftmid>0 && value == -1){
                            while (leftmid>0) {
                                value = match(nums, target, --leftmid);
                                if(value!=-1){break;}
                            }
                        }
                    }


                    if (value == -1) {
                        value = match(nums, target, rightmid);
                    }

                    if (value == -1) {


                        rightmid = (right + 1 + rightend) / 2;
                        value = match(nums, target, rightmid);
                        if(rightmid< nums.length-1 && value == -1){
                            while (rightmid< nums.length-1) {

                                value = match(nums, target, ++rightmid);
                                if(value!=-1){break;}
                        }
                    }
                    if (value == -1) {
                        rightmid = (right + rightend - 1) / 2;
                        value = match(nums, target, rightmid);
                        if(rightmid> mid && value == -1) {
                            while (rightmid>mid) {
                                value = match(nums, target, --rightmid);
                                if(value!=-1){break;}
                            }
                            }
                        }


                    }
                }
            }else {
                if(nums[0]== target)
                    return  0;else return -1;
            }


      return value;
    }
    public int match(int[] nums,int target, int mid)
    {
        if(nums[mid]==target){
            return mid;
        }else return -1;
    }
}
