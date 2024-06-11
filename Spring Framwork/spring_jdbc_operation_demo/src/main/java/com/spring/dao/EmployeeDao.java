package com.spring.dao;

import com.spring.entity.Employee;

public interface EmployeeDao {
	int insert(Employee emp);
	int update(Employee emp);
	int delete(int id);
}