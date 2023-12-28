package com.springjpa.demo.dao;

import com.springjpa.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findByEmployees(String dept);

    public List<Employee> deleteByEmployees(String name);
    public List<Employee> findByEmployeesanddept(String name,String dept);

    @Query("select u from EMPLOYEE_TB2 u")
    public List<Employee> getEmployeesCustomQuery();



}
