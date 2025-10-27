package com.SpringBootProject.em_managment_project;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@SpringBootApplication

@RestController
public class EmpController {

    
    final EmployeeService employeeService;

    EmpController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("employee")
    public List<Employees> getEmployees() {
        return employeeService.readEmployees();
    }

    @PostMapping("employee")
    public String postEmployee(@RequestBody Employees employees) {
        //TODO: process POST request
        //emp.add(employees);
        
        return employeeService.createEmployee(employees);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
       if(employeeService.deleteEmployee(id)){
          return "Delete Succesfully";
       }
       return "Not Found";
    }
    
    
}
