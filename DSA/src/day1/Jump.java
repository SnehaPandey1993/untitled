package day1;

import org.junit.Test;

public class Jump {

    @Test
    public void test1() {

        int[] arr = {3, 5, 1, 1, 4};

        System.out.println(jumpSolution(arr));
    }

    public int jumpSolution(int[] arr) {

        int endIndex = arr.length - 1;
        int jump = 0;
        int max = 0;
        int nextIndex = 0;

        if (endIndex == 0) return 0;

        for (int index = 0; index <= endIndex; index++) {

            index = nextIndex;
            max = 0;
            if ((index + arr[index]) >= endIndex) {
                jump++;
                break;
            }
            for (int j = 1; j <= arr[index]; j++) {

                if (j + arr[index + j] > max) {

                    max = j + arr[index + j];
                    nextIndex = index + j;
                    if (max >= endIndex) break;
                }
            }
            jump++;
        }
        return jump;
    }
}
