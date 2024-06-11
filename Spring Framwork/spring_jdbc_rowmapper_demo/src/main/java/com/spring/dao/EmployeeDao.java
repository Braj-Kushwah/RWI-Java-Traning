
package com.spring.dao;
import java.util.*;
import com.spring.entity.Employee;

public interface EmployeeDao {
	int insert(Employee employee);
	Employee getEmployee(int id);
	List<Employee> getAllEmployees();
}
