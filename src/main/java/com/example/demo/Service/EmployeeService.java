package com.example.demo.Service;

import com.example.demo.Entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    List<EmployeeEntity> getEmployeeList();

    EmployeeEntity addNewEmployee(EmployeeEntity newEmployeeEntity);

}
