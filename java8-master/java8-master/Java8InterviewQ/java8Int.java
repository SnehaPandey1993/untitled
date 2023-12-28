package com.javatechie.lambda.demo.Java8InterviewQ;




import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java8Int {
    public static void main(String args[]) {

    /*  DoPayment dp=  (sour,dest)-> sour+":"+dest;

        System.out.println(dp.dopay("sneha","rahul"));

        Function<Integer,String> fun=(t)->"output :"+t;
        System.out.println(fun.apply(21));

        Predicate<Integer> predicate =(t)->t>4;



        List<Integer> list=Arrays.asList(1,2,4,5,34,40,4,45);
       // list.stream().filter(t->t>4).forEach(test::printElement);

        }
         public void printElement(int i){
        System.out.println(i);
        Consumer<String> con=(t)-> {
            System.out.println("consumed");
        };
*/

        String input = "iloveurahul";
        /*find occurence of each char*/

           Map<String, List<String>> map1 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s->s));
           System.out.println("result:::" + map1);

        Map<String, Long> map = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("result:::" + map);

        /*find duplicates*/
        List<String> duplicates;
        duplicates = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Duplicates::::" + duplicates);


        /*First non repeat*/

        String nonreap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println("non repeating first character  " + nonreap);


        int[] number = {5,9,11,2,8,1};
        Integer secondhigh = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second highest "+secondhigh);

         String[] Strarr={"java","techices" , "springBoot", "Microservices"};
         String longest= Arrays.stream(Strarr).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        Integer count= Arrays.stream(Strarr).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get().length();

        System.out.println("longest character "+longest+"  count "+count);

        List<String> str=Arrays.stream(number).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(str);
    }
}
