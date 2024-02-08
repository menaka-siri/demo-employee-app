package com.zealtrack.employeecrud.dao;

import com.zealtrack.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
