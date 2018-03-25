package com.intuit.etm.vo;

import java.io.Serializable;

/**
 * Employee VO 
 * @author rbonigi
 *
 */
public class Employee implements Serializable {
	
	private String empId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	private String empUid;
	private String empFnm;
	private String empLnm;
	
	public String getEmpFnm() {
		return empFnm;
	}
	public void setEmpFnm(String empFnm) {
		this.empFnm = empFnm;
	}
	public String getEmpLnm() {
		return empLnm;
	}
	public void setEmpLnm(String empLnm) {
		this.empLnm = empLnm;
	}
	public String getEmpUid() {
		return empUid;
	}
	public void setEmpUid(String empUid) {
		this.empUid = empUid;
	}
	public String toString() {
		return "UID :: "+empUid+" First Name::"+empFnm+" Last Name::"+empFnm;
	}


}
