package Stack;

import org.junit.Test;

import java.util.*;

public class NextLargest {

    @Test
    public void test1() {
        long[] arr = {10, 3, 12, 4, 2, 9, 13, 0, 8, 11, 1, 7, 5, 6};
        long[] element = nextLargerElement(arr, arr.length);
        System.out.println(Arrays.toString(element));
    }

    @Test
    public void test2() {
        long[] arr = {5, 4, 3, 2, 1};
        long[] element = nextLargerElement(arr, arr.length);
        System.out.println(Arrays.toString(element));
    }
    @Test
    public void test3() {
        long[] arr = {7,8,1,4};
        long[] element = nextLargerElement(arr, arr.length);
        System.out.println(Arrays.toString(element));
    }


    public static long[] nextLargerElement1(long[] arr, int n) {

        long[] sent = new long[n];
        long max = arr[0];
        int index = 0;
        int i = 0, j = 0;
        while (i < n) {
            j = i + 1;
            while (j < n) {
                if (max < arr[j] && index < j) {
                    max = arr[j];
                    index = j;
                    break;
                } else if (arr[i] < arr[j]) {
                    max = arr[j];
                    index = j;
                    break;
                }
                j++;
            }
            if (arr[i] == max || index < i) {
                sent[i] = -1;

            } else if (index > i) {
                sent[i] = max;
            }
            i++;
        }
        return sent;
        // Your code here
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        long[] sent1 = new long[arr.length];
         Stack<Long> st= new Stack<>();
         long i= arr.length-1;
        while (0<=i) {
            long temp=-1;
            if(st.isEmpty())
            {
                sent1[(int) i]=-1;
            }
            long current = arr[(int) i];
            while (!st.isEmpty()){
                temp = st.pop();
                if (current < temp) {
                    sent1[(int) i] = temp;
                    st.push( temp);
                   break;
                } else if (st.size()==0) {
                    sent1[(int) i]=-1;
                }
            }
            st.push( current);

            i--;
        }
        return sent1;
    }
}
