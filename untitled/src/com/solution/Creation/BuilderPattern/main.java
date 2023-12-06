package com.solution.Creation.BuilderPattern;

public class main {
    public static void main(String args[])
    {
        Director engd1= new Director(new Engneeringbuilder());
        Director mbad2=new Director(new MBABuilder());
       Student st= engd1.createStudent();
       Student mbst=mbad2.createStudent();
        System.out.println(st);
        System.out.println(mbst);

    }
}
