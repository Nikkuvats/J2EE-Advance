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
@Table(name="topicmaster")
public class TopicMasterPojo implements Serializable{

	private static final long serialVersionUID = -5854548150338368758L;

	@Id
	@GeneratedValue
	@Column(name="TopicId")
	private Integer TopicId;
	
	@Column(name="TechId")
	private Integer TechId;
	
	@Column(name="TopicName")
	private String TopicName;

	@Column(name="IsVisible")
	private Integer IsVisible;
	
	@Column(name="Weight")
	private Integer Weight;
	
	/*@Column(name="DeliveryTime")
	private String DeliveryTime;*/
	
	@Column(name="ImgLogo")
	private String Img;
	
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
	
	public Integer getTechId() {
		return TechId;
	}

	public void setTechId(Integer techId) {
		TechId = techId;
	}

	@ManyToOne
	@JoinColumn(name="TechId",updatable=false, insertable=false)
	private TechnologyMasterPojo technologyPojo;
	
	@OneToMany(fetch=FetchType.EAGER, targetEntity=SubTopicMasterPojo.class, mappedBy="topicPojo")
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({CascadeType.ALL})
	private List<SubTopicMasterPojo> subTopicMasterPojo;
	
	public List<SubTopicMasterPojo> getSubTopicMasterPojo() {
		return subTopicMasterPojo;
	}

	public void setSubTopicMasterPojo(List<SubTopicMasterPojo> subTopicMasterPojo) {
		this.subTopicMasterPojo = subTopicMasterPojo;
	}


	public TechnologyMasterPojo getTechnologyPojo() {
		return technologyPojo;
	}

	public void setTechnologyPojo(TechnologyMasterPojo technologyPojo) {
		this.technologyPojo = technologyPojo;
	}

	public Integer getTopicId() {
		return TopicId;
	}

	public void setTopicId(Integer topicId) {
		TopicId = topicId;
	}

	public String getTopicName() {
		return TopicName;
	}

	public void setTopicName(String topicName) {
		TopicName = topicName;
	}

	public Integer getIsVisible() {
		return IsVisible;
	}

	public void setIsVisible(Integer isVisible) {
		IsVisible = isVisible;
	}

	public Integer getWeight() {
		return Weight;
	}

	public void setWeight(Integer weight) {
		Weight = weight;
	}

	/*public String getDeliveryTime() {
		return DeliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		DeliveryTime = deliveryTime;
	}*/

	public String getImg() {
		return Img;
	}

	public void setImg(String img) {
		Img = img;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
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
	
}
