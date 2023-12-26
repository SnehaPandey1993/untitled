package com.solution.LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

//LC 735
public class AstroiedCollision {
    //iterate the array list from last to first
    //check i and i-1 which is greater in number ignore the sign & then check sign of both the numbers
    //if both signs are same , add it in the array ,if signs are different then add the greater number in array
public static void main(String args[]){
    AstroiedCollision astroiedCollision=new AstroiedCollision();
    int[] ast={-2,-1,1,2};
   // int[] ast2={-2,-2,-2,1};
  int[] say= astroiedCollision.asteroidCollision(ast);
    System.out.println(Arrays.toString(say));
   // astroiedCollision.asteroidCollision(ast2);
}
    public static String checkSign(int a, int b) {
        if((a>0 && b>0)||(a<0&&b<0)){
            return "NoCollision";
        }else if((a<0 && b>0)){
            return "NoCollision";
        } else {
            return "Collision";
        }
    }

    public static String checkGreaterNumber(int a, int b) {
        if(a <0 ){
            a = a * -1;
        }
        if(b<0){
            b=b*-1;

        }
        if(a<b){
            return "a";
        } else if (a==b) {
            return "equal";
        } else{
            return "b";
        }
    }

    /*
      -ve & -ve =no collision
      -ve& +ve =no collision
      +ve & +ve =no collision
      +ve & -ve = collision
     */
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for (int val: asteroids){
            if(val>0) {
                st.push(val);
            }else {
                while (st.size()>0 && st.peek()>0 && st.peek()<-val){
                    st.pop();
                }
                if(st.size()>0 && st.peek() < -val){
                    st.pop();
                }
                else if(st.size()>0 && st.peek() > -val){

                }
                else if(st.size()>0 && st.peek() == -val){
                    st.pop();
                }else{
                    st.push(val);
                }
            }
        }
        int[] coll=st.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return coll;
    }

    public int[] asteroidCollision1(int[] asteroids) {
        String less;int index=0;
        Stack<Integer> st=new Stack<>();
        for(int value:asteroids) {
            if (value > 0) {
                st.push(value);
            } else if(st.size()>0 && st.peek()>0 && st.peek()<value){
                st.pop();
            }
                String negativeflag = checkSign(st.peek(), value);
                if (negativeflag.equals("Collision")) {
                    less = checkGreaterNumber(st.peek(), value);
                    if (st.size()>0&& less.equals("a")) {
                        st.pop();
                    } else if (st.size()>0&&less.equals("b")) {

                    } else if (st.size()>0&&less.equals("equal")) {
                        st.pop();
                    }

                 }else{
                    st.push(value);

                }

        }
        int[] primitive = st.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(primitive));
    return primitive;
    }
}
