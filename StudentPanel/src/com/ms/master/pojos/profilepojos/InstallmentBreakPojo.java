package com.ms.master.pojos.profilepojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="installmentbreak")
public class InstallmentBreakPojo implements Serializable{

	private static final long serialVersionUID = -2026306022499869100L;
	
	@Id
	@GeneratedValue
	@Column(name="InstBrId")
	private Integer instBrId;
	
	@Column(name="Sno")
	private Integer Sno;
	
	@Column(name="NOI")
	private Integer NOI;
	
	@Column(name="Percentage")
	private Float percentage;
	
	@Column(name="instSubmitDuration")
	private Integer instSubmitDuration;

	@ManyToOne
	@JoinColumn(name="NOI",updatable=false, insertable=false)
	private InstallmentBreakDetailsPojo instBreakDetails;
	
	public InstallmentBreakDetailsPojo getInstBreakDetails() {
		return instBreakDetails;
	}

	public void setInstBreakDetails(InstallmentBreakDetailsPojo instBreakDetails) {
		this.instBreakDetails = instBreakDetails;
	}

	public Integer getInstBrId() {
		return instBrId;
	}

	public void setInstBrId(Integer instBrId) {
		this.instBrId = instBrId;
	}

	public Integer getSno() {
		return Sno;
	}

	public void setSno(Integer sno) {
		Sno = sno;
	}

	public Integer getNOI() {
		return NOI;
	}

	public void setNOI(Integer nOI) {
		NOI = nOI;
	}

	public Float getPercentage() {
		return percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

	public Integer getInstSubmitDuration() {
		return instSubmitDuration;
	}

	public void setInstSubmitDuration(Integer instSubmitDuration) {
		this.instSubmitDuration = instSubmitDuration;
	}
	
	
	
}
