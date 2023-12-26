package com.solution.ProblemSolving.Map;

public class Customer {
    private Integer empid;
    private String name;
    private Integer Salary;

    public Customer(Integer empid, String name, Integer salary) {
        this.empid = empid;
        this.name = name;
        Salary = salary;
    }

    public Integer getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return Salary;
    }


}
