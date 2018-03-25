package com.intuit.etm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.intuit.etm.dao.EmployeeDAO;
import com.intuit.etm.vo.Employee;

/**
 * ETM_EMPLOYEE Table DAO Interface Implementation
 * @author rbonigi
 *
 */
@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * Crate Employee method
	 * 
	 */
	public void createEmployee(Employee emp) {
		System.out.println("Entered createEmployee Method EmployeeDAOImpl\n"+emp);
        jdbcTemplate.update("INSERT INTO ETM_EMPLOYEE (EMP_UID, EMP_FNM, EMP_LNM) VALUES (?, ?, ?)", emp.getEmpUid(), emp.getEmpFnm(), emp.getEmpLnm());
        System.out.println("Employee Added!!");		
	}
	
	/**
	 * Get all the employee method
	 */
	public List<Employee> findAll() {
		System.out.println("Entered FindAll Method EmployeeDAOImpl");
        List < Employee > employees = jdbcTemplate.query("SELECT EMP_ID, EMP_UID, EMP_FNM, EMP_LNM FROM ETM_EMPLOYEE", new BeanPropertyRowMapper(Employee.class));
        System.out.println("Employee List"+employees);
        return employees;
	}

}
