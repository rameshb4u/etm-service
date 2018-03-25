package com.intuit.etm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.etm.service.EmployeeService;
import com.intuit.etm.vo.Employee;
/**
 * EmployeeController is the rest service interface to create employees and get list of employees
 * @author rbonigi
 * 
 *
 */
@RestController
@RequestMapping("/etm/emp/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	/**
	 * This method creates the employee with userid, firstname and lastname
	 * @param emp
	 * @return
	 */
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String createEmployee(@RequestBody Employee emp) {	
		if(emp==null|| (emp.getEmpUid()==null || emp.getEmpUid().trim()=="")) {
			return "Invalid Employee Data";
		}
		//Calling CreateEmployee Method for employee creation
		employeeService.createEmployee(emp);
		return "EMPLOYEE CREATED";	
	}
	
	/**
	 * This method retuns all the employees assicated with the application
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public List<Employee> getAllEmplyees() {
		
		return employeeService.findAll();
	}
	
}
