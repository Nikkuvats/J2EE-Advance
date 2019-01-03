package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="stdtechmaster")
public class StdTechPojo implements Serializable{

	private static final long serialVersionUID = -1642153802943208402L;

	@Id
	@GeneratedValue
	@Column(name="StdTechId")
	private Integer stdTechId;

	@Column(name="studentRegNo")
	private Integer studentRegNo;

	@Column(name="techId")
	private Integer techId;

	@ManyToOne
	@JoinColumn(name="studentRegNo",insertable=false, updatable=false)
	private StudentRegPojo stdRegPojo;

	public StudentRegPojo getStdRegPojo() {
		return stdRegPojo;
	}

	public void setStdRegPojo(StudentRegPojo stdRegPojo) {
		this.stdRegPojo = stdRegPojo;
	}

	public Integer getStdTechId() {
		return stdTechId;
	}

	public void setStdTechId(Integer stdTechId) {
		this.stdTechId = stdTechId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}


}

