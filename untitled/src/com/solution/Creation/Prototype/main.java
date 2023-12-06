package com.solution.Creation.Prototype;

public class main {
    public static void main(String args[]){
        Student obj= new Student(25,2345,"snhea");
        System.out.println(obj);
        Student cloneobj= (Student) obj.clone();
        System.out.println(cloneobj);
    }
}
