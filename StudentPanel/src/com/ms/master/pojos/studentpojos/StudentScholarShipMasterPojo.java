package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scholarshipmaster")
public class StudentScholarShipMasterPojo implements Serializable{

	private static final long serialVersionUID = 8806210030624406131L;
	
	@Id
	@Column(name="Mobile")
	private String mobile;
	
	@Column(name="PaperId")
	private String paperId;
	
	@Column(name="technology")
	private String technology;
	
	@Column(name="ObtainedMarks")
	private Integer obtainedMarks;
	
	@Column(name="discount")
	private Float discount;
	
	@Column(name="TestDate")
	private String testDate;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="ExpireDate")
	private String expireDate;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPaperId() {
		return paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Integer getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(Integer obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}
	
	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public String getTestDate() {
		return testDate;
	}

	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
	
	
}
