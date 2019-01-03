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
@Table(name="stdpackmaster")
public class StdPackagePojo implements Serializable{

	private static final long serialVersionUID = 4267518172617324878L;

	@Id
	@GeneratedValue
	@Column(name="stdPackId")
	private Integer stdPackId;
	
	@Column(name="studentRegNo")
	private Integer studentRegNo;
	
	@Column(name="packId")
	private Integer packId;

	@ManyToOne
	@JoinColumn(name="studentRegNo",insertable=false, updatable=false)
	private StudentRegPojo stdRegPojo;

	
	public StudentRegPojo getStdRegPojo() {
		return stdRegPojo;
	}

	public void setStdRegPojo(StudentRegPojo stdRegPojo) {
		this.stdRegPojo = stdRegPojo;
	}

	public Integer getStdPackId() {
		return stdPackId;
	}

	public void setStdPackId(Integer stdPackId) {
		this.stdPackId = stdPackId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public Integer getPackId() {
		return packId;
	}

	public void setPackId(Integer packId) {
		this.packId = packId;
	}
	
	
	
	
}
