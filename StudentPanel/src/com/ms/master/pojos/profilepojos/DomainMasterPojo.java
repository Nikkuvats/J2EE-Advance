package com.ms.master.pojos.profilepojos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="domainmaster")
public class DomainMasterPojo implements Serializable{

	private static final long serialVersionUID = -1755290806562831388L;

	@Id
	@GeneratedValue
	@Column(name="DomainId")
	private Integer DomainId;
	
	@Column(name="DomainName")
	private String DomainName;
	
	/*@Column(name="IsVisible")
	private Integer IsVisible;
	
	@Column(name="CreatedBy")
	private String CreatedBy;
	
	@Column(name="CreatedDate")
	private Date CreatedDate;
	
	@Column(name="UpdatedBy")
	private String UpdatedBy;
	
	@Column(name="UpdatedDate")
	private Date UpdatedDate;*/
	
	@OneToMany(fetch=FetchType.EAGER, targetEntity=CourseMasterPojo.class, mappedBy="domainPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	List<CourseMasterPojo> courseMasterPojo;

	public List<CourseMasterPojo> getCourseMasterPojo() {
		return courseMasterPojo;
	}

	public void setCourseMasterPojo(List<CourseMasterPojo> courseMasterPojo) {
		this.courseMasterPojo = courseMasterPojo;
	}

	public Integer getDomainId() {
		return DomainId;
	}

	public void setDomainId(Integer domainId) {
		DomainId = domainId;
	}

	public String getDomainName() {
		return DomainName;
	}

	public void setDomainName(String domainName) {
		DomainName = domainName;
	}

	/*public Integer getIsVisible() {
		return IsVisible;
	}

	public void setIsVisible(Integer isVisible) {
		IsVisible = isVisible;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public String getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}	
	
	*/
}
