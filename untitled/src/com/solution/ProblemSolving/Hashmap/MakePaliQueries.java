package com.solution.ProblemSolving.Hashmap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakePaliQueries {
    @Test
    public void Test1(){
        String s="abcda";
        int[][] queries=new int[][]{{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}};
        List<Boolean> boolean1=new ArrayList<>();
        boolean1= canMakePaliQueries(s,queries);
        System.out.println(boolean1);
    }
    @Test
    public void Test2(){
        String s="hunu";
        int[][] queries=new int[][]{{1,1,1},{2,3,0},{3,3,1},{0,3,2},{1,3,3},{2,3,1},{3,3,1},{0,3,0},{1,1,1},{2,3,0},{3,3,1},{0,3,1},{1,1,1}};
        List<Boolean> boolean1=new ArrayList<>();
        boolean1= canMakePaliQueries(s,queries);
        System.out.println(boolean1);
    }
    @Test
    public void Test3(){
        String s="ninmjmj";
        int[][] queries=new int[][]{{6,6,0},{1,1,1},{2,5,4},{1,3,1},{5,6,1}};
        List<Boolean> boolean1=new ArrayList<>();
        boolean1= canMakePaliQueries(s,queries);
        System.out.println(boolean1);
    }
    private List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> list = new ArrayList<>();

        int n = s.length();
        int[][] map = new int[n+1][26];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<26;j++)
                map[i+1][j] = map[i][j];

            map[i+1][s.charAt(i) - 'a']++;
        }

        for(int[] q : queries)
        {
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int count = 0;

            for(int i=0;i<26;i++)
                count += (map[r+1][i] - map[l][i]) % 2;// count total characters that have odd count, so that we can replace the half of them with their pair.

            list.add(count/2 <= k);// if we can replace half of them with their pair
        }

        return list;
    }
    private List<Boolean> canMakePaliQueries1(String s, int[][] queries) {
        int[] data = new int[0];
        char[] sdata=s.toCharArray();
        StringBuilder set = new StringBuilder();
        List<Boolean> flaglist= new ArrayList<>();
        for (var arr : queries) {
            data = arr;
            int Left=data[0];
            int Right=data[1];
            int Count=data[2];
                while(Left<=Right){
                    set.append(sdata[Left]);
                    Left++;
                }
                boolean flag=false;
                int diffcount=0,samecount=0;
               int Sleft=0,Sright=0;
                       if(set.length()%2==0)
                       {
                           Sright=set.length()/2;
                       }else {
                           Sright=(set.length()/2)+1;
                       }

              while (Sleft <Sright && set.length() > 1&& Sright< set.length()) {
                  if (set.charAt(Sleft) == set.charAt(Sright)) {
                          samecount++;
                      }
                      if (set.charAt(Sleft) != set.charAt(Sright)) {
                          diffcount++;
                      }
                      Sright++;Sleft++;
                  }
           System.out.println("set::::"+set+" diffcount  "+diffcount+"   samecount   "+samecount+"  Count   "+Count);
              if(set.length() ==1){
                  flag=true;
              }else if((diffcount<=Count&& Count>0)){
                  flag=false;
              }else {
                  flag=true;
              }
            flaglist.add(flag);
            set = new StringBuilder();
        }
       return flaglist;
    }
}
