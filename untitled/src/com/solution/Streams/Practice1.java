package com.solution.Streams;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice1 {
    @Test
    public void Test1(){
        List<String> list= Arrays.asList("12","21","33");
        List<Integer> intlist=convertInDS(list);
        System.out.println(intlist);
    }
    @Test
    public void Test2(){
        String input="IwillMasterCoding";
        Map<String,Long> map1=countingChar(input);
        System.out.println(map1);
        List<String> map2=countingChardup(input);
        System.out.println(map2);
        int[] number={4,5,7,9,12};
        int secondhighest= secHigh(number);
        System.out.println(secondhighest);
        String[] strArray={"java","prepare","SpringBoot","Microservice"};
        String largestString= longestString(strArray);
        System.out.println(largestString);
        int[] numb2={5,8,10,12};
        List<String> coll1=collect1Numb(numb2);
        System.out.println(coll1);
    }
       @Test
    public void Test3(){
          Map<String, Integer> map1 = new HashMap<>();
                 map1.put("anil", 2000);
                  map1.put("anil1", 1000);
                   map1.put("anil2", 40000);
                   map1.put("anil3", 7000);
                    map1.put("anil4", 90000);

                          System.out.println("first high"+gethighsal(4,map1));
    }
     private static Map.Entry<String,Integer> gethighsal(int i, Map<String, Integer> map1) {
        
            return map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).skip(i-1).findFirst().get();
            
        }
        private List<String> collect1Numb(int[] numb2) {
        List<String> list1=Arrays.stream(numb2).boxed().map(s->s+"").filter(x->x.startsWith("1")).collect(Collectors.toList());
                return list1;
    }

    private String longestString(String[] strArray) {
        String longestString=Arrays.stream(strArray).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
     return longestString;
    }

    private int secHigh(int[] number) {
         int sechigh= Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        return sechigh;
    }

    private Map<String, Long> countingChar(String input) {
    Map<String, Long> map1=Arrays.stream(input.split("")).map(s->s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    return map1;
    }
    private List<String> countingChardup(String input) {
        List<String> map1=Arrays.stream(input.split("")).map(s->s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        return map1;
    }
    private List<Integer> convertInDS(List<String> intS) {
      List<Integer> intlist= intS.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        return intlist;
    }
}
