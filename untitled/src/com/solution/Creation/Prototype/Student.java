package com.solution.Creation.Prototype;

public class Student implements Prototype {
    int age;
    private  int rollnumber;
    String name;
     Student(){}
    Student(int age, int rollnumber, String name) {
        this.age = age;
        this.rollnumber = rollnumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(age,rollnumber,name);
    }
}
