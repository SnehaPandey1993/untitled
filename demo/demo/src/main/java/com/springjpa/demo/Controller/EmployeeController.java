package com.springjpa.demo.Controller;

import com.springjpa.demo.dto.InputRequest;
import com.springjpa.demo.model.Employee;
import com.springjpa.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployee(){
        return service.getEmployee();
    }
    @GetMapping("/getEmployeeById/{dept}")
    public List<Employee> getByIdByDept(@RequestParam("dept") String dept){
        return service.getEmployeeById(dept);
    }
    @GetMapping("/getEmployeeById/{dept}/{name}")
    public List<Employee> getByIdByDeptandName(@PathVariable String name,@PathVariable String dept){
        return service.findbyempanddept(name,dept);
    }
    @PostMapping("/addEmployee")
    public String save(@RequestBody InputRequest<Employee> request){
        return service.saveEmployee(request);
    }

    @PutMapping("/updateEmployee/{id}/{salary}")
    public  String update(@PathVariable int id,@PathVariable double salary,@RequestBody InputRequest<Employee> request){
        return  service.updateEmployee(id,salary,request);
    }

}
