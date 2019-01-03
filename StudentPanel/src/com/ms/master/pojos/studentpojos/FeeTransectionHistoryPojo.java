package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="feetransectionhistory")
public class FeeTransectionHistoryPojo implements Serializable{
	
	private static final long serialVersionUID = -4574446292047675371L;

	@Id
	@Column(name="transectionId")
	private String transectionId;
	
	@Column(name="feeId")
	private Integer feeId;
	
	@Column(name="amount")
	private Integer amount;
	
	@Column(name="amountType")
	public String amountType="FEE";
	
	@Column(name="trType")
	private String trType;
	
	@Column(name="createdDate")
	private String createdDate;
	
	@Column(name="createdBy")
	private String createdBy;
	
	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getTrType() {
		return trType;
	}

	public void setTrType(String trType) {
		this.trType = trType;
	}

	public String getTransectionId() {
		return transectionId;
	}

	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId;
	}

	public Integer getFeeId() {
		return feeId;
	}

	public void setFeeId(Integer feeId) {
		this.feeId = feeId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
}
