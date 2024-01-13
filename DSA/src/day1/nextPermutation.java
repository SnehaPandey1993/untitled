package day1;

import org.junit.Test;

import java.util.Arrays;


/*
*
 */
public class nextPermutation {
    @Test
    public void test1() {

        int[] arr = {1,1,5};

        System.out.println(nextPermutation(arr));
    }
    public int[] nextPermutation_while(int[] nums) {
        int i=1;
        int min=nums[0];

        if(nums.length ==2 ){
            int swap= nums[1];
            nums[1]=nums[0];
            nums[0]=swap;
            return nums;
        }else {
            while (i < nums.length) {
                boolean satus = findifanymax(nums[0], nums);
                if (satus == true && i < nums.length) {
                    int[] sort = sort(i, nums);
                    if (nums == sort(i, nums) && nums[0] != nums[1]) {
                        int swap = nums[2];
                        nums[2] = nums[1];
                        nums[1] = swap;
                        break;
                    } else if (nums == sort(i, nums) && nums[0] == nums[1]) {

                        int swap = nums[2];
                        nums[2] = nums[1];
                        nums[1] = swap;
                        break;
                    } else {
                        if (min <= nums[i]) {
                            int swap = nums[i];
                            nums[i] = nums[1];
                            nums[1] = swap;
                            sort(2, nums);
                            break;
                        }
                    }
                } else if (satus == false) {

                    if (nums == sort(i, nums) && nums[0] != nums[1]) {
                        sort(0, nums);

                    }
                }

                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return nums;
    }
    public  boolean  findifanymax(int max, int[] nums){
        int i=1;
        boolean flag= false;
        while (i<nums.length){
           if(max< nums[i]){
             flag= true;
             break;
           }else {
               flag= false;
           }

            i++;
        }
        return  flag;
    }
    public int[] sort(int index, int[] nums){
        int i=index;
        int j=index+1;
        while (i<nums.length){
            while (j< nums.length){
                if(nums[i]< nums[j]){
                    int swap= nums[i];
                    nums[i]=nums[j];
                    nums[j]=swap;
                }
                j++;
            }
            j=i+1;
            i++;
        }
        return nums;
    }
    public int[] nextPermutation(int[] nums) {
        int j = nums.length - 1;
        int i = nums.length - 2;

        while (i >= 0) {
            if (nums[i] < nums[j]) {
                if (i == nums.length - 2) {
                    swap(i, j, nums);
                    break;
                }
                i--;
                j--;
                if (i == -1) {
                    reverse(i + 1, nums);
                }
            }
            System.out.println(Arrays.toString(nums));


        }
        return nums;
    }

    public int[] swap(int a, int b , int[] nums){
          int swap= nums[a];
          nums[a]=nums[b];
          nums[b]=swap;
        return nums;
    }
    public int[] reverse(int i, int[] nums){
        int start = i;
        int end = nums.length -1;
        while (start<end)
        {
            swap(start,end,nums) ;
            start++;
            end--;
        }
        return nums;
    }
}
