package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="installmentmaster")
public class StdFeeInstallmentPojo implements Serializable{

	private static final long serialVersionUID = 583790513549877487L;
	
	@Id
	@GeneratedValue
	@Column(name="InstId")
	private Integer instId;
	
	@Column(name="FeeId")
	private Integer feeId;
	
	@Column(name="InstOrder")
	private Integer instOrder;
	
	@Column(name="InstAmount")
	private Integer instAmount;
	
	@Column(name="SubmitAmount")
	private Integer submitAmount;
	
	@Column(name="DueDate")
	private String dueDate;
	
	@Column(name="Status")
	private Integer status;
	
	@Column(name="submittedBy")
	private String submittedBy;
	
	@Column(name="submittedDate")
	private String submittedDate;
	
	@Column(name="updatedBy")
	private String updatedBy;
	
	@Column(name="updatedDate")
	private String updatedDate;

	@Transient
	private Integer instProcessStatus=0;
	
	@ManyToOne
	@JoinColumn(name="feeId",updatable=false,insertable=false)
	@Cascade({CascadeType.REFRESH})
	private StdFeeMasterPojo feeMasterPojo;

	
	public Integer getInstProcessStatus() {
		return instProcessStatus;
	}

	public void setInstProcessStatus(Integer instProcessStatus) {
		this.instProcessStatus = instProcessStatus;
	}

	public Integer getInstId() {
		return instId;
	}

	public void setInstId(Integer instId) {
		this.instId = instId;
	}

	public Integer getFeeId() {
		return feeId;
	}

	public void setFeeId(Integer feeId) {
		this.feeId = feeId;
	}

	public Integer getInstOrder() {
		return instOrder;
	}

	public void setInstOrder(Integer instOrder) {
		this.instOrder = instOrder;
	}

	public Integer getInstAmount() {
		return instAmount;
	}

	public void setInstAmount(Integer instAmount) {
		this.instAmount = instAmount;
	}

	public Integer getSubmitAmount() {
		return submitAmount;
	}

	public void setSubmitAmount(Integer submitAmount) {
		this.submitAmount = submitAmount;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}

	public String getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
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
