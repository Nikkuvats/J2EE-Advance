package com.ms.master.pojos.profilepojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="packagedetails")
public class PackageDetailPojo implements Serializable{
	
	private static final long serialVersionUID = 6884604059389828795L;

	@Id
	@GeneratedValue
	@Column(name="Id")
	private Integer id;
	
	@Column(name="packId")
	private Integer packId;
	
	@Column(name="techId")
	private Integer techId;
	
	@OneToOne
	@JoinColumn(name="packId",insertable=false, updatable=false)
	private PackageMasterPojo packagePojo;
	
	@OneToOne
	@JoinColumn(name="techId",updatable=false,insertable=false)
	private TechnologyMasterPojo technologyPojo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPackId() {
		return packId;
	}

	public void setPackId(Integer packId) {
		this.packId = packId;
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}

	public PackageMasterPojo getPackagePojo() {
		return packagePojo;
	}

	public void setPackagePojo(PackageMasterPojo packagePojo) {
		this.packagePojo = packagePojo;
	}

	public TechnologyMasterPojo getTechnologyPojo() {
		return technologyPojo;
	}

	public void setTechnologyPojo(TechnologyMasterPojo technologyPojo) {
		this.technologyPojo = technologyPojo;
	}
	
	
}
