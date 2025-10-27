package com.SpringBootProject.em_managment_project;

import java.util.*;


public interface EmployeeService {
    String createEmployee(Employees employee);
    List <Employees> readEmployees();
    boolean deleteEmployee(Long id);
}