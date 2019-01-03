package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="stdexperiencemaster")
public class StudentExpPojo implements Serializable{

	private static final long serialVersionUID = 9094763034493463393L;
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private Integer id;
	
	@Column(name="studentRegNo")
	private Integer studentRegNo;
	
	@Column(name="totalExp")
	private String totalExp;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="skills")
	private String skills;

	@OneToOne
	@JoinColumn(name="studentRegNo",insertable=false, updatable=false)
	private StudentRegPojo stdRegPojo;
	
	public StudentRegPojo getStdRegPojo() {
		return stdRegPojo;
	}

	public void setStdRegPojo(StudentRegPojo stdRegPojo) {
		this.stdRegPojo = stdRegPojo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(String totalExp) {
		this.totalExp = totalExp;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
	
}
