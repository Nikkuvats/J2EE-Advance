package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name="stdqualificationmaster")
public class StudentEduPojo implements Serializable{

	private static final long serialVersionUID = 8320217728311831837L;
	
	@Id
	@GeneratedValue
	@Column(name="QualificationId")
	private Integer qualificationId;
	
	@Column(name="studentRegNo")
	private Integer studentRegNo;
	
	@Column(name="CourseName")
	private String courseName;
	
	@Column(name="RollNo")
	private String rollNo;
	
	@Column(name="UnvBoard")
	private String unvBoard;
	
	@Column(name="Program")
	private String program;
	
	@Column(name="beginYear")
	private Integer beginYear;
	
	@Column(name="endYear")
	private Integer endYear;
	
	@Column(name="Percentage")
	private Integer percentage;

	@ManyToOne
	@JoinColumn(name="studentRegNo",insertable=false, updatable=false)
	private StudentRegPojo stdRegPojo;
	
	public StudentRegPojo getStdRegPojo() {
		return stdRegPojo;
	}

	public void setStdRegPojo(StudentRegPojo stdRegPojo) {
		this.stdRegPojo = stdRegPojo;
	}

	public Integer getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(Integer qualificationId) {
		this.qualificationId = qualificationId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getUnvBoard() {
		return unvBoard;
	}

	public void setUnvBoard(String unvBoard) {
		this.unvBoard = unvBoard;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public Integer getBeginYear() {
		return beginYear;
	}

	public void setBeginYear(Integer beginYear) {
		this.beginYear = beginYear;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	
	
}
