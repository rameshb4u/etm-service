package com.intuit.etm.vo;

/**
 * Feed VO
 * @author rbonigi
 *
 */
public class Feed {
	
	private Integer twtId;
	private Integer empId;
	private String empFnm;
	private String empLnm;
	private String twt;
	private String crtTs;
	
	public String getCrtTs() {
		return crtTs;
	}
	public void setCrtTs(String crtTs) {
		this.crtTs = crtTs;
	}
	public Integer getTwtId() {
		return twtId;
	}
	public void setTwtId(Integer twtId) {
		this.twtId = twtId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
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
	public String getTwt() {
		return twt;
	}
	public void setTwt(String twt) {
		this.twt = twt;
	}

	

}
