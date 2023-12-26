package com.solution.ProblemSolving.Set;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class ExampleSet {
    public static void main(String args[]){
      //  Set<String> hset= new HashSet<>();
         //Set<String> hset= new LinkedHashSet<>();
        Set<String> hset= new CopyOnWriteArraySet<>();

      //  Set<String> hset= new TreeSet<>();
        hset.add("sneha");
        hset.add("rahul");
        hset.add("Aashish");
        Iterator<String> itr=hset.iterator();
        while (itr.hasNext())
        {
            System.out.println("elements "+itr.next());
        }
      /*  for (String s:hset){
            System.out.println("set "+s.length());

        }*/
     }
}
