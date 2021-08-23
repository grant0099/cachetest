package com.example.controller;

import com.example.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.EmployeeService;

/**
 * Created by grant on 2021/8/24.
 */

@RestController
public class testController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/test")
    public Employee test(){

        return employeeService.getEmp(1);

    }
}
