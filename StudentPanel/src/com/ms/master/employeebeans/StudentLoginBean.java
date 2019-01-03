package com.ms.master.employeebeans;

public class StudentLoginBean {
	
	private String StudentId;
	private String StudentName;
	private Integer branchId;
	private String branchName;
	private Integer RegNo;
	private String mobile;
	
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Integer getRegNo() {
		return RegNo;
	}
	public void setRegNo(Integer regNo) {
		RegNo = regNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
}