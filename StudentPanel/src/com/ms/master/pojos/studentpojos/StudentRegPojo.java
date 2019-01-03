package com.ms.master.pojos.studentpojos;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="stdregmaster")
public class StudentRegPojo implements Serializable{

	private static final long serialVersionUID = 4208758895055071749L;
	
	@Id
	@GeneratedValue
	@Column(name="StudentRegNo")
	private Integer studentRegNo;
	
	@Column(name="StudentId")
	private String studentId;
	
	@Column(name="BranchId")
	private Integer branchId;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="Mobile")
	private String mobile;
	
	@Column(name="Email")
	private String emailId;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="WorkingStatus")
	private Integer workingStatus;
	
	@Column(name="RegStatus")
	private Integer regStatus;
	
	@Column(name="ActiveStatus")
	private String activeStatus;
	
	@Column(name="CourseCompStatus")
	private Integer courseCompStatus;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="EmrgNo")
	private String emrgNo;
	
	@Column(name="CAddress")
	private String cAddress;
	
	@Column(name="CCity")
	private String cCity;
	
	@Column(name="CState")
	private String cState;
	
	@Column(name="CCountry")
	private String cCountry;
	
	@Column(name="CPin")
	private String cPin;
	
	@Column(name="PAddress")
	private String pAddress;
	
	@Column(name="PCity")
	private String pCity;
	
	@Column(name="PState")
	private String pState;
	
	@Column(name="PCountry")
	private String pCountry;
	
	@Column(name="PPin")
	private String pPin;
	
	@Column(name="regDate")
	private String regDate;

	/*@Column(name="batchId")
	private Integer batchId=null;*/
	
/*	@Column(name="profilePic")
	private String profilePic;
	
	@Column(name="signature")
	private String signature;*/
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="CreatedDate")
	private String createdDate;
	
	@Column(name="UpdatedBy")
	private String updatedBy;
	
	@Column(name="UpdatedDate")
	private String updatedDate;
	
	/*@ManyToOne
	@JoinColumn(name="batchId",insertable=false, updatable=false)
	private BatchMasterPojo batch;
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity=StudentEduPojo.class,mappedBy="stdRegPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	private List<StudentEduPojo> stuEduList;
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity=StdCoursePojo.class,mappedBy="stdRegPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	private List<StdCoursePojo> stuCourses;
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity=StdTechPojo.class,mappedBy="stdRegPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	private List<StdTechPojo> stuTechs;
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity=StdPackagePojo.class,mappedBy="stdRegPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	private List<StdPackagePojo> stdPackages;
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity=StudentDocPojo.class ,mappedBy="stdRegPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	private List<StudentDocPojo> stdDocs; 
	
	@OneToOne(fetch=FetchType.EAGER,targetEntity=StdFeeMasterPojo.class,mappedBy="stdRegPojo")
	@Fetch(FetchMode.JOIN)
	@Cascade({CascadeType.ALL})
	private StdFeeMasterPojo stdFeeMasterPojo;
	
	@OneToOne(fetch=FetchType.EAGER,targetEntity=StudentExpPojo.class,mappedBy="stdRegPojo")
	@Fetch(FetchMode.JOIN)
	@Cascade({CascadeType.ALL})
	private StudentExpPojo stdExpPojo;;
	*/
/*	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}*/
/*
	public BatchMasterPojo getBatch() {
		return batch;
	}

	public void setBatch(BatchMasterPojo batch) {
		this.batch = batch;
	}*/

/*	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}*/

	/*public List<StdTechPojo> getStuTechs() {
		return stuTechs;
	}

	public void setStuTechs(List<StdTechPojo> stuTechs) {
		this.stuTechs = stuTechs;
	}

	public List<StdPackagePojo> getStdPackages() {
		return stdPackages;
	}

	public void setStdPackages(List<StdPackagePojo> stdPackages) {
		this.stdPackages = stdPackages;
	}

	public List<StudentDocPojo> getStdDocs() {
		return stdDocs;
	}

	public void setStdDocs(List<StudentDocPojo> stdDocs) {
		this.stdDocs = stdDocs;
	}

	public StudentExpPojo getStdExpPojo() {
		return stdExpPojo;
	}

	public void setStdExpPojo(StudentExpPojo stdExpPojo) {
		this.stdExpPojo = stdExpPojo;
	}

	public List<StudentEduPojo> getStuEduList() {
		return stuEduList;
	}

	public void setStuEduList(List<StudentEduPojo> stuEduList) {
		this.stuEduList = stuEduList;
	}

	public List<StdCoursePojo> getStuCourses() {
		return stuCourses;
	}

	public void setStuCourses(List<StdCoursePojo> stuCourses) {
		this.stuCourses = stuCourses;
	}

	public StdFeeMasterPojo getStdFeeMasterPojo() {
		return stdFeeMasterPojo;
	}

	public void setStdFeeMasterPojo(StdFeeMasterPojo stdFeeMasterPojo) {
		this.stdFeeMasterPojo = stdFeeMasterPojo;
	}
*/
	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
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

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

	public Integer getWorkingStatus() {
		return workingStatus;
	}

	public void setWorkingStatus(Integer workingStatus) {
		this.workingStatus = workingStatus;
	}

	public String getEmrgNo() {
		return emrgNo;
	}

	public void setEmrgNo(String emrgNo) {
		this.emrgNo = emrgNo;
	}

	public Integer getRegStatus() {
		return regStatus;
	}

	public void setRegStatus(Integer regStatus) {
		this.regStatus = regStatus;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public String getcCountry() {
		return cCountry;
	}

	public void setcCountry(String cCountry) {
		this.cCountry = cCountry;
	}

	public String getcPin() {
		return cPin;
	}

	public void setcPin(String cPin) {
		this.cPin = cPin;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public String getpCity() {
		return pCity;
	}

	public void setpCity(String pCity) {
		this.pCity = pCity;
	}

	public String getpState() {
		return pState;
	}

	public void setpState(String pState) {
		this.pState = pState;
	}

	public String getpCountry() {
		return pCountry;
	}

	public void setpCountry(String pCountry) {
		this.pCountry = pCountry;
	}

	public String getpPin() {
		return pPin;
	}

	public void setpPin(String pPin) {
		this.pPin = pPin;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	
}	
