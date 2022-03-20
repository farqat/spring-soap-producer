package com.example.springsoap.service;

import com.example.springsoap.entity.Employee;
import com.example.springsoap.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeById(long empId){
        Employee emp = employeeRepository.findByEmployeeId(empId);
        return emp;
    }
}
