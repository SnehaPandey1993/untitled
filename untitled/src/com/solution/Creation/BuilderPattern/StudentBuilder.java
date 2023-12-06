package com.solution.Creation.BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollnumber;
    int age;
    String name;
    String mothername;
    String fathername;
    List<String> subject;

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
        return this;
    }

    public StudentBuilder setFathername(String fathername) {
        this.fathername = fathername;
        return this;
    }

    public StudentBuilder setMothername(String mothername) {
        this.mothername = mothername;
        return this;
    }
    abstract public StudentBuilder setsubject();
    public Student build(){
      return new Student(this);
    }

}
