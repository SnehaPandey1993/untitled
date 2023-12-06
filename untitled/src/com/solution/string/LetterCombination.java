package com.solution.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class LetterCombination {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
         int first=word1.length();
         int second=word2.length();
         int max=0;
         if(first>=second)
         {
            max=first;
         }else {
             max=second;
         }
      for (int i=0; i<(max);i++){
          try {
              if((i<first)) {
                  sb.append(word1.charAt(i));
              }
              if(i<second) {
                  sb.append(word2.charAt(i));
              }

          }catch (ArrayIndexOutOfBoundsException ae){
              ae.getMessage();
          }

      }
      return sb.toString();
    }
    public int strongPasswordChecker(String password) {
        int count=0;

        if(password.length()<=6  ){
           count++;
        }
        if(password.length()>=20 || password.length()<=4){
            count++;
        }
        if (!checkd(password))
        {
            count++;
        }

        if (!checku(password))
        {
            count++;
        }
        if (!checkl(password))
        {
            count++;
        }
        if (reap(password))
        {
            count++;
        }

     return count;
    }
    public static boolean checkd(String s){

        boolean flag=false;
        for(int i :s.toCharArray()) {
            if (Character.isDigit(i)) {
                flag = true;
            }
        }
        return flag;
    }
    public static boolean checku(String s) {

        boolean flag = false;
        for (int i : s.toCharArray()) {
            if (Character.isUpperCase(i)) {
                flag = true;
            }
        }
        return  flag;
    }
    public static boolean checkl(String s) {

        boolean flag = false;
        for (int i : s.toCharArray()) {
            if (Character.isLowerCase(i)) {
                flag = true;
            }
        }
        return  flag;
    }
    public static boolean reap(String s) {

        boolean flag = false;
        for (int i=0;i<s.length();i++) {
            if(s.length()>2&&s.length()-1<i) {
                 if (s.charAt(i - 1) == s.charAt(i)&&s.charAt(i) == s.charAt(i + 1)) {
                        flag = true;
                    }
                }
        }
        if(s.length()<=4|| s.length()>=20){
            flag=true;
        }

        return  flag;
    }
    public List<String> letterCombinations(String digits) {
    int[] num={0,1,2,3,4,5,6,7,8,9};
    String[] alp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] ch= new String[digits.length()];
        ArrayList<String> list = new ArrayList<String>();
      //  LinkedList<String> listn = new LinkedList<String>();

        //Rahul
       // String first = alp[4];
        for (int i=0; i<digits.length();i++){
            int num1= Integer.parseInt(String.valueOf(digits.charAt(i)));
            list.add(alp[num1]);
        }
        int count=0;
        for (String lists:list){
           ch[count]=lists;
           count++;
        }
        for(int j=0;j<list.size();j++){
           rec(list.get(j));
        }
    return  list;

    }
    public static List<String> rec(String data)
    {
        LinkedList<String> listn = new LinkedList<String>();
        data.charAt(0);
       return  listn;
    }

    public static void main(String args[]){
        LetterCombination lc= new LetterCombination();
       // lc.letterCombinations("23");
       // lc.mergeAlternately("ab","pqrs");
        lc.strongPasswordChecker("aA123");
        System.out.println(lc.strongPasswordChecker("1337C0d3"));
        System.out.println(lc.strongPasswordChecker("aA1"));
        System.out.println(lc.strongPasswordChecker("aA123"));
        System.out.println(lc.strongPasswordChecker("aa123"));
    }
}
