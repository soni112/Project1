package com.example.demo.Service.impl;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity addNewEmployee(EmployeeEntity newEmployeeEntity) {
        return employeeRepository.save(newEmployeeEntity);
    }
}
