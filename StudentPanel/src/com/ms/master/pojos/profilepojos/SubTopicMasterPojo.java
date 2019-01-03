package com.ms.master.pojos.profilepojos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subtopicmaster")
public class SubTopicMasterPojo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5114163448236675911L;

	@Id
	@GeneratedValue
	@Column(name="SubTopicId")
	private Integer SubTopicId;
	
	@Column(name="TopicId")
	private Integer TopicId;
	
	@Column(name="SubTopicName")
	private String SubTopicName;

	@Column(name="Weight")
	private Integer Weight;
	
	@Column(name="isVisible")
	private Integer IsVisible;
	
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
	
	@ManyToOne()
	@JoinColumn(name="TopicId",updatable=false, insertable=false)
	private TopicMasterPojo topicPojo;

	public TopicMasterPojo getTopicPojo() {
		return topicPojo;
	}

	public void setTopicPojo(TopicMasterPojo topicPojo) {
		this.topicPojo = topicPojo;
	}

	public Integer getSubTopicId() {
		return SubTopicId;
	}

	public void setSubTopicId(Integer subTopicId) {
		SubTopicId = subTopicId;
	}

	public Integer getTopicId() {
		return TopicId;
	}

	public void setTopicId(Integer topicId) {
		TopicId = topicId;
	}

	public String getSubTopicName() {
		return SubTopicName;
	}

	public void setSubTopicName(String subTopicName) {
		SubTopicName = subTopicName;
	}

	public Integer getWeight() {
		return Weight;
	}

	public void setWeight(Integer weight) {
		Weight = weight;
	}

	public Integer getIsVisible() {
		return IsVisible;
	}

	public void setIsVisible(Integer isVisible) {
		IsVisible = isVisible;
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
