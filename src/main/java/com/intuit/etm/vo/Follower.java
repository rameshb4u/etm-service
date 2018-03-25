package com.intuit.etm.vo;

import java.io.Serializable;

/**
 * Follower VO
 * @author rbonigi
 *
 */
public class Follower implements Serializable {
	
	private Employee emp;
	private Employee follower;
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Employee getFollower() {
		return follower;
	}
	public void setFollower(Employee follower) {
		this.follower = follower;
	}

}
