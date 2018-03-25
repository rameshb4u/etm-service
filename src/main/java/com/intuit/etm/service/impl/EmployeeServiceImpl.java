package com.intuit.etm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.etm.dao.EmployeeDAO;
import com.intuit.etm.service.EmployeeService;
import com.intuit.etm.vo.Employee;

/**
 * Employee Service Implementation
 * @author rbonigi
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDAO.createEmployee(emp);

	}

	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

}
