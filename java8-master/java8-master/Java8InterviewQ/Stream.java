package com.javatechie.lambda.demo.Java8InterviewQ;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream.*;

import static java.util.stream.Collectors.groupingBy;

public class Stream  {
    public static void main(String  args[]){
        List<Integer> ls1= java.util.stream.Stream.of(1,2,3,3,4,5).collect(Collectors.toList());
        System.out.println(ls1);
        Comparator salcom=Comparator.comparing(Employee::getSalary);
        List<Employee> emplist= java.util.stream.Stream.of(new Employee("sneha","Developer",4500000),
                                                          new Employee("rahul","Test",5000000),
                                                          new Employee("aashish","Developer",5500000)
                ).collect(Collectors.toList());

        Map<String, Optional<Employee>> emp= (Map<String, Optional<Employee>>) emplist.stream().collect(groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(salcom))));
        System.out.println(emp.toString());

        IntStream.rangeClosed(1,10).forEach(t-> System.out.println(Thread.currentThread().getName()+t));
        System.out.println("----------------------------------------------------------------------------");
        IntStream.rangeClosed(1,10).parallel().forEach(t-> System.out.println(Thread.currentThread().getName()+t));
    }
}
