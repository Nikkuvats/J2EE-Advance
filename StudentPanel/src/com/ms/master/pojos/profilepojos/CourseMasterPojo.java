package com.ms.master.pojos.profilepojos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="CourseMaster")
public class CourseMasterPojo implements Serializable{

	private static final long serialVersionUID = 1358073001362527592L;

	@Id
	@GeneratedValue
	@Column(name="CourseId")
	private Integer CourseId;
	
	@Column(name="DomainId")
	private Integer DomainId;

	@Column(name="CourseName")
	private String CourseName;
	
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
	
	public Integer getDomainId() {
		return DomainId;
	}

	public void setDomainId(Integer domainId) {
		DomainId = domainId;
	}

	@ManyToOne()
	@JoinColumn(name="DomainId",updatable=false, insertable=false)
	private DomainMasterPojo domainPojo; 
	
	/*@OneToMany(fetch=FetchType.EAGER, targetEntity=TechnologyMasterPojo.class, mappedBy="coursePojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	List<TechnologyMasterPojo> technologyMasterPojo;*/

	public Integer getCourseId() {
		return CourseId;
	}

	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
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
	}*/

	public DomainMasterPojo getDomainPojo() {
		return domainPojo;
	}

	public void setDomainPojo(DomainMasterPojo domainPojo) {
		this.domainPojo = domainPojo;
	}

	/*public List<TechnologyMasterPojo> getTechnologyMasterPojo() {
		return technologyMasterPojo;
	}

	public void setTechnologyMasterPojo(
			List<TechnologyMasterPojo> technologyMasterPojo) {
		this.technologyMasterPojo = technologyMasterPojo;
	}
*/
}
