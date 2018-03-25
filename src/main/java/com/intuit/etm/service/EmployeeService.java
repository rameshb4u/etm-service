package com.intuit.etm.service;

import java.util.List;

import com.intuit.etm.vo.Employee;

/**
 * Employee Service Interface
 * @author rbonigi
 *
 */
public interface EmployeeService {
	
	void createEmployee(Employee emp);
	List<Employee> findAll();

}
