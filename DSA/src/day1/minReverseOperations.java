package day1;

import org.junit.Test;

import java.util.Arrays;

public class minReverseOperations {
    @Test
    public void test1() {
        int n = 5;
        int  p = 0;
        int[] banned = {};
        int k = 2;

        System.out.println(Arrays.toString(minReverseOperations(n,p,banned,k)));
    }
    public int[] minReverseOperations(int n, int p, int[] banned, int k) {
        int[] out= new int[n];
        int i=0;
        while(i < n)
        {
            if(banned.length>0) {
                if ((i == p) && !(banned[0] >= p && banned[banned.length - 1] <= p)) {
                    out[i] = 0;
                } else if ((i == k - 1)) {
                    if ((banned[0] >= k - 1 && banned[banned.length - 1] >= k - 1)) {
                        out[i] = -1;
                    } else {
                        out[i] = 1;
                    }
                } else {
                    out[i] = -1;

                }
            }else {
                if((i==p))
                {
                    out[i] = 0;
                }else {
                    if(k>p) {
                        out[i] = i;
                    }else{
                        out[i] = -1;

                    }
                }
            }
            i++;
        }
        return out;
    }
}
