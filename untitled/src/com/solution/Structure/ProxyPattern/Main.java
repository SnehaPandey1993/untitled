package com.solution.Structure.ProxyPattern;

public class Main {
    public static void main(String args[]){
        EmployeeDAO employeeDAO=new EmployeeDAOProxy(new EmployeeDAOImpl());
    }
}
