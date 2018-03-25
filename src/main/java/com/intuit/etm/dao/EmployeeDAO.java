package com.intuit.etm.dao;

import java.util.List;

import com.intuit.etm.vo.Employee;

/**
 * ETM_EMPLOYEE Table DAO Interface
 * @author rbonigi
 *
 */
public interface EmployeeDAO {
	
	void createEmployee(Employee emp);
	
	List<Employee> findAll();

}
