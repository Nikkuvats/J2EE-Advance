package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="student_search_view")
public class StudentSearchPojo implements Serializable{

	private static final long serialVersionUID = 8015364352482354319L;

	@Id
	@Column(name="studentRegNo")
	private Integer studentRegNo;
	
	@Column(name="studentId")
	private String studentId;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="branchId")
	private Integer branchId;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="email")
	private String email;
	
	@Column(name="activeStatus")
	private String activeStatus;
	
	@Column(name="CourseCompStatus")
	private Integer courseCompStatus;
	
	@Column(name="regDate")
	private String regDate;

	@Column(name="courseId")
	private Integer courseId;

	@Column(name="domainId")
	private Integer domainId;
	
	@Column(name="batchId")
	private Integer batchId;
	
	@Column(name="feeStatus")
	private String feeStatus;
	
	public String getFeeStatus() {
		return feeStatus;
	}

	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getCourseCompStatus() {
		return courseCompStatus;
	}

	public void setCourseCompStatus(Integer courseCompStatus) {
		this.courseCompStatus = courseCompStatus;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getDomainId() {
		return domainId;
	}

	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}
	
	
	@Override
	public int hashCode() {
		return this.studentRegNo.hashCode();
	}
	
	public boolean equals(Object obj){
		StudentSearchPojo regPojo = (StudentSearchPojo) obj;
		return this.studentRegNo==regPojo.studentRegNo;
		
	}
	
}
