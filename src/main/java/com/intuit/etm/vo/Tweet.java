package com.intuit.etm.vo;

/**
 * Tweet VO
 * @author supraja
 *
 */
public class Tweet {
	
	private Employee emp;
	private String tweet;
	private String timeStamp;
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
