package com.solution.ProblemSolving.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix2D {
    @Test
    public void Test1(){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        matrix.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
        matrix.add(new ArrayList<>(Arrays.asList(9,10,11,12)));
        boolean state=searchMatrix(matrix,8);
    }

    private boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int n) {
        int a=matrix.size();
        int b=matrix.get(0).size();
        System.out.println(a+"  row  "+b+"  col");
        int low=0 , high=(a*b)-1;

        while (low<=high){
            int mid=(low+high)/2;
              int row=mid/b, col=mid%b;

            if(matrix.get(row).get(col)==n){
                return true;
            } else if (matrix.get(row).get(col)<n) {
                low=mid+1;
            }else high=mid-1;
        }
        return false;
    }
}
