package com.spring.dao;

import com.spring.entity.Employee;

public interface EmployeeDAo {
	int insert(Employee employee);
	int delete(int id);
	int update(Employee employee);
}