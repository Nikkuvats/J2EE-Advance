package com.ms.master.pojos.studentpojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ms.master.pojos.profilepojos.CertificatePojo;

@Entity
@Table(name="stdcertificatmaster")
public class StdCertiMasterPojo 
{
    @Id
    @GeneratedValue
    
    @Column(name="StdCertId")
    private Integer stdCertId;
    
    @Column(name="StudentRegNo")
    private Integer studentRegNo;
    
    @Column(name="CertificateId")
    private Integer certificateId;
    
    @Column(name="IssuNo")
    private Integer issuNo;
    
    @Column(name="Status")
    private String status;
    
    @Column(name="AppliedDate")
    private String appliedDate;
    
    @Column(name="IssuDate")
    private String issuDate;
    
    @Column(name="IssuBy")
    private String issuBy;

    @ManyToOne
    @JoinColumn(name="certificateId",insertable=false,updatable=false)
    private CertificatePojo certName;
    
    
	public CertificatePojo getCertName() {
		return certName;
	}

	public void setCertName(CertificatePojo certName) {
		this.certName = certName;
	}

	public Integer getStdCertId() {
		return stdCertId;
	}

	public void setStdCertId(Integer stdCertId) {
		this.stdCertId = stdCertId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public Integer getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(Integer certificateId) {
		this.certificateId = certificateId;
	}

	public Integer getIssuNo() {
		return issuNo;
	}

	public void setIssuNo(Integer issuNo) {
		this.issuNo = issuNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(String appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getIssuDate() {
		return issuDate;
	}

	public void setIssuDate(String issuDate) {
		this.issuDate = issuDate;
	}

	public String getIssuBy() {
		return issuBy;
	}

	public void setIssuBy(String issuBy) {
		this.issuBy = issuBy;
	}
    
    
    
}
