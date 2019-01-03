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
@Table(name="stddocumentdetails")
public class StudentDocPojo implements Serializable{

	private static final long serialVersionUID = -5494335887837664344L;

	@Id
	@GeneratedValue
	@Column(name="docId")
	private Integer docId;
	
	@Column(name="studentRegNo")
	private Integer studentRegNo;
	
	@Column(name="docName")
	private String docName;
	
	@Column(name="docUrl")
	private String docUrl;

	@ManyToOne
	@JoinColumn(name="studentRegNo",insertable=false, updatable=false)
	private StudentRegPojo stdRegPojo;

	
	public StudentRegPojo getStdRegPojo() {
		return stdRegPojo;
	}

	public void setStdRegPojo(StudentRegPojo stdRegPojo) {
		this.stdRegPojo = stdRegPojo;
	}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}
	
	
	
}
