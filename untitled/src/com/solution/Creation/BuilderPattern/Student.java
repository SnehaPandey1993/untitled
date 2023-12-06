package com.solution.Creation.BuilderPattern;

import java.util.List;

public class Student {
    int rollnumber;
    int age;
    String name;
    String mothername;
    String fathername;
    List<String> subject;


    @Override
    public String toString() {
        return
                "rollnumber=" + this.rollnumber +
                ", age=" + this.age +
                ", name='" + this.name + '\'' +
                ", mothername='" + this.mothername + '\'' +
                ", fathername='" + this.fathername + '\'' +
                ", subject=" + subject.get(0) +","+subject.get(1)+","+subject.get(2);

    }

    public Student(StudentBuilder studentBuilder) {
        this.rollnumber = studentBuilder.rollnumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.mothername = studentBuilder.mothername;
        this.fathername = studentBuilder.fathername;
        this.subject = studentBuilder.subject;
    }
}
