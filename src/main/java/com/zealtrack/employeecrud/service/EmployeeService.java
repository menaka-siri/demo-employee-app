package com.zealtrack.employeecrud.service;


import com.zealtrack.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
