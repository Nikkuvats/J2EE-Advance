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
@Table(name="technologymaster")
public class TechnologyMasterPojo implements Serializable{
	
	private static final long serialVersionUID = 8977270157123372635L;

	@Id
	@GeneratedValue
	@Column(name="TechId")
	private Integer TechId;
	
	@Column(name="CourseId")
	private Integer CourseId;

	@Column(name="TechName")
	private String TechnologyName;
	
	@Column(name="IsVisible")
	private Integer IsVisible;
	
	@Column(name="TechFee")
	private Integer TechFee;
	
	/*@Column(name="DeliveryTime")
	private String DeliveryTime;*/
	
	@Column(name="Weight")
	private Integer Weight;
	
	@Column(name="Imglogo")
	private String Imglogo;
	
	@Column(name="Descrip")
	private String descrip;
	
	@Column(name="CreatedBy")
	private String CreatedBy;
	
	@Column(name="CreatedDate")
	private Date CreatedDate;
	
	@Column(name="UpdatedBy")
	private String UpdatedBy;
	
	@Column(name="UpdatedDate")
	private Date UpdatedDate;
	
	public Integer getCourseId() {
		return CourseId;
	}

	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}

	@ManyToOne()
	@JoinColumn(name="CourseId",updatable=false, insertable=false)
	private CourseMasterPojo coursePojo; 
	
	@OneToMany(fetch=FetchType.EAGER, targetEntity=TopicMasterPojo.class, mappedBy="technologyPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	List<TopicMasterPojo> techTopicMasterPojo;

	public Integer getTechId() {
		return TechId;
	}

	public void setTechId(Integer techId) {
		TechId = techId;
	}

	public String getTechnologyName() {
		return TechnologyName;
	}

	public void setTechnologyName(String technologyName) {
		TechnologyName = technologyName;
	}

	public CourseMasterPojo getCoursePojo() {
		return coursePojo;
	}

	public void setCoursePojo(CourseMasterPojo coursePojo) {
		this.coursePojo = coursePojo;
	}

	public Integer getIsVisible() {
		return IsVisible;
	}

	public void setIsVisible(Integer isVisible) {
		IsVisible = isVisible;
	}

	public String getImglogo() {
		return Imglogo;
	}

	public void setImglogo(String imglogo) {
		Imglogo = imglogo;
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

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public List<TopicMasterPojo> getTechTopicMasterPojo() {
		return techTopicMasterPojo;
	}

	public void setTechTopicMasterPojo(List<TopicMasterPojo> techTopicMasterPojo) {
		this.techTopicMasterPojo = techTopicMasterPojo;
	}

	public Integer getTechFee() {
		return TechFee;
	}

	public void setTechFee(Integer techFee) {
		TechFee = techFee;
	}

	/*public String getDeliveryTime() {
		return DeliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		DeliveryTime = deliveryTime;
	}*/

	public Integer getWeight() {
		return Weight;
	}

	public void setWeight(Integer weight) {
		Weight = weight;
	}

}
