package com.ms.master.pojos.studentpojos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="feemaster")
public class StdFeeMasterPojo implements Serializable{

	private static final long serialVersionUID = 6659797491425112944L;
	
	@Id
	@GeneratedValue
	@Column(name="FeeId")
	private Integer feeId;
	
	@Column(name="studentRegNo")
	private Integer studentRegNo;
	
	@Column(name="totalAmount")
	private Integer totalAmount;
	
	@Column(name="aftDiscAmount")
	private Float aftDiscAmount;
	
	@Column(name="serviceTax")
	private Float serviceTax;
	
	@Column(name="payableAmt")
	private Integer payableAmt;
	
	@Column(name="MgtDisc")
	private Float MgtDisc;
	
	@Column(name="NOI")
	private Integer NOI;
	
	@Column(name="Disc")
	private Float disc;
	
	@Column(name="DiscType")
	private String discType;
	
	@Column(name="ANOI")
	private Integer ANOI;
	
	@Column(name="MNOI")
	private Integer MNOI;

	@Column(name="balanceAmt")
	private Integer balanceAmt;
	
	@Column(name="submitStatus")
	private String submitStatus;
	
	@Column(name="createdBy")
	private String createdBy;
	
	@Column(name="createdDate")
	private String createdDate;
	
	@Column(name="updatedBy")
	private String updatedBy;
	
	@Column(name="updatedDate")
	private String updatedDate;
	
/*	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="studentRegNo",updatable=false,insertable=false)
	private StudentRegPojo stdRegPojo;

	@OneToMany(fetch=FetchType.EAGER,mappedBy="feeMasterPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	private List<StdFeeInstallmentPojo> feeInstallments; */

	
	public String getSubmitStatus() {
		return submitStatus;
	}

	public void setSubmitStatus(String submitStatus) {
		this.submitStatus = submitStatus;
	}

	public Integer getBalanceAmt() {
		return balanceAmt;
	}

	public void setBalanceAmt(Integer balanceAmt) {
		this.balanceAmt = balanceAmt;
	}

/*	public List<StdFeeInstallmentPojo> getFeeInstallments() {
		return feeInstallments;
	}

	public void setFeeInstallments(List<StdFeeInstallmentPojo> feeInstallments) {
		this.feeInstallments = feeInstallments;
	}

	public StudentRegPojo getStdRegPojo() {
		return stdRegPojo;
	}

	public void setStdRegPojo(StudentRegPojo stdRegPojo) {
		this.stdRegPojo = stdRegPojo;
	}*/

	public Float getDisc() {
		return disc;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Float getAftDiscAmount() {
		return aftDiscAmount;
	}

	public void setAftDiscAmount(Float aftDiscAmount) {
		this.aftDiscAmount = aftDiscAmount;
	}

	public Float getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(Float serviceTax) {
		this.serviceTax = serviceTax;
	}

	public Integer getPayableAmt() {
		return payableAmt;
	}

	public void setPayableAmt(Integer payableAmt) {
		this.payableAmt = payableAmt;
	}

	public Float getMgtDisc() {
		return MgtDisc;
	}

	public void setMgtDisc(Float mgtDisc) {
		MgtDisc = mgtDisc;
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

	public void setDisc(Float disc) {
		this.disc = disc;
	}

	public Integer getFeeId() {
		return feeId;
	}

	public void setFeeId(Integer feeId) {
		this.feeId = feeId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public Integer getNOI() {
		return NOI;
	}

	public void setNOI(Integer nOI) {
		NOI = nOI;
	}

	public String getDiscType() {
		return discType;
	}

	public void setDiscType(String discType) {
		this.discType = discType;
	}

	public Integer getANOI() {
		return ANOI;
	}

	public void setANOI(Integer aNOI) {
		ANOI = aNOI;
	}

	public Integer getMNOI() {
		return MNOI;
	}

	public void setMNOI(Integer mNOI) {
		MNOI = mNOI;
	}
	
	
	
}
