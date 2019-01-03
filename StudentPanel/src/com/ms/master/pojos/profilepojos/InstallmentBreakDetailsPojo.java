package com.ms.master.pojos.profilepojos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="installmentbreakdetails")
public class InstallmentBreakDetailsPojo  implements Serializable{

	private static final long serialVersionUID = -8969610533698755182L;
	
	@Id
	@Column(name="NOI")
	private Integer NOI;
	
	@Column(name="minAmount")
	private Integer minAmount;
	
	@Column(name="maxAmount")
	private Integer maxAmount;

	@OneToMany(fetch=FetchType.EAGER, mappedBy="instBreakDetails")
	@Fetch(FetchMode.SUBSELECT)
	@OrderBy("Sno asc")
	private List<InstallmentBreakPojo> installmentBreaks;
	
	public List<InstallmentBreakPojo> getInstallmentBreaks() {
		return installmentBreaks;
	}

	public void setInstallmentBreaks(List<InstallmentBreakPojo> installmentBreaks) {
		this.installmentBreaks = installmentBreaks;
	}

	public Integer getNOI() {
		return NOI;
	}

	public void setNOI(Integer nOI) {
		NOI = nOI;
	}

	public Integer getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(Integer minAmount) {
		this.minAmount = minAmount;
	}

	public Integer getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(Integer maxAmount) {
		this.maxAmount = maxAmount;
	}
	
	
}
