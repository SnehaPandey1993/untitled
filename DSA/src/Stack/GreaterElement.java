package Stack;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class GreaterElement {

    @Test
    public void test1() {
        int[] arr = {10, 3, 12, 4, 2, 9, 13, 0, 8, 11, 1, 7, 5, 6};
        int[] element = secondGreaterElement(arr);
        System.out.println(Arrays.toString(element));
    }

    @Test
    public void test2() {
        int[] arr = {1,17,18,0,18,10,20,0};
        int[] element = secondGreaterElement(arr);
        System.out.println(Arrays.toString(element));
    }

    @Test
    public void test3() {
        int[] arr = {11,13,15,12,0,15,12,11,9};
        int[] element = secondGreaterElement(arr);
        System.out.println(Arrays.toString(element));
    }

    public int[] secondGreaterElement(int[] nums) {
        int[] sort = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int i = nums.length - 1;

        while (i >= 0) {
            int current = nums[i];
            if (st.size() < 2 ) {
                sort[i] = -1;

            }

            while (st.size() >= 2 ) {
                int max = st.pop();
                int secMax=st.pop();
                 if(current>max){
                    st.push(max);
                 }
                if (current < max ) {
                        sort[i] = secMax;
                         st.push(secMax);
                          st.push(max);
                    break;
                } else if(st.size()<2){
                    sort[i] = -1;

                }

            }
            st.push(current);
            i--;
        }
        return sort;
    }
}
