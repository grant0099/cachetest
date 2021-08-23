package com.example.service;

import com.example.bean.Employee;
import com.example.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by grant on 2021/8/24.
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = {"emp"})
    public Employee getEmp(Integer id){
        Employee employee = employeeMapper.getEmployeebyId(id);
        System.out.println(123456);
        return employee;
    }

}
