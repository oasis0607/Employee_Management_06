package com.SpringBootProject.em_managment_project;

import java.util.ArrayList;
import java.util.*;

public class EmployeeServiceImp implements EmployeeService{

    List<Employees>employees=new ArrayList<>();
    @Override
    public String createEmployee(Employees employee) {
       employees.add(employee);
       return "Saved Succesfully";
    }

    @Override
    public boolean deleteEmployee(Long id) {
        // TODO Auto-generated method stub
        employees.remove(id);
        return true;
    }

    @Override
    public List<Employees> readEmployees() {
        // TODO Auto-generated method stub

        return employees;
    }
   
}
