package com.example.demo.Controller;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employeeList")
    public List<?> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

    @PostMapping("/addEmployee")
    public EmployeeEntity addNewEmployee(@RequestBody EmployeeEntity newEmployeeEntity) {
        return employeeService.addNewEmployee(newEmployeeEntity);
    }

}
