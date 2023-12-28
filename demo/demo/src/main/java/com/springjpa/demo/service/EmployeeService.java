package com.springjpa.demo.service;


import com.springjpa.demo.dao.EmployeeRepository;
import com.springjpa.demo.dto.InputRequest;
import com.springjpa.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getEmployee(){
       return repository.findAll();
    }
    public List<Employee> deleteEmployee(String name){
        return repository.deleteByEmployees(name);
    }
    public List<Employee> getCustomquery(){
        return repository.getEmployeesCustomQuery();
    }
    public List<Employee> getEmployeeById(String dept){
        return repository.findByEmployees(dept);
    }
    public List<Employee> findbyempanddept(String name,String dept){
        return repository.findByEmployeesanddept(name,dept);
    }
   /* public Page<Employee> getPaginatedEmployee(){
        return repository.findAll();
    }*/
    public String saveEmployee(InputRequest<Employee> request){
        String currentUser=request.getLoggedInUser();
        System.out.println("current User "+currentUser);
        request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());
        System.out.println("Time zone User "+Calendar.getInstance().getTimeZone().getDisplayName());
        Employee employee=request.getEmployee();
        employee.setCreatedBy(currentUser);
        repository.save(employee);
     return "Employee saved Successfully";
    }
    public String updateEmployee(int id, double salary, InputRequest<Employee> request){
        Employee employee=repository.findById(id).get();
        if(employee!=null) {
            employee.setSalary(salary);
            employee.setCreatedBy(request.getLoggedInUser());
            repository.saveAndFlush(employee);
        }else {
            throw new RuntimeException("Employee id not found "+id);
        }

        return "updated Successfully";
    }
}
