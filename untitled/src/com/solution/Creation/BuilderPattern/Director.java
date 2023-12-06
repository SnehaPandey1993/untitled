package com.solution.Creation.BuilderPattern;

public class Director {
    StudentBuilder studentbuilder;

    public Director(StudentBuilder studentbuilder) {
        this.studentbuilder = studentbuilder;
    }
    public Student createStudent(){
       if(studentbuilder instanceof Engneeringbuilder){
           return createEngineeringStudent();
       } else if (studentbuilder instanceof MBABuilder ) {
           return createMBAStudent();
       }
       return null;
    }

    private Student createEngineeringStudent(){
      return  studentbuilder.setRollnumber(1).setAge(123).setFathername("avi").build();
    }
    private Student createMBAStudent(){
     return studentbuilder.setRollnumber(2).setAge(233).setFathername("rajesh").setMothername("madhu").build();
    }
}
