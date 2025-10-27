package com.SpringBootProject.em_managment_project;

import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service  
@Component
public interface EmployeeService {
    String createEmployee(Employees employee);
    List <Employees> readEmployees();
    boolean deleteEmployee(Long id);
}