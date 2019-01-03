package com.ms.master.pojos.profilepojos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="packagemaster")
public class PackageMasterPojo implements Serializable{

	private static final long serialVersionUID = -3831377882749754764L;
	
	@Id
	@GeneratedValue
	@Column(name="PackId")
	private Integer packId;
	
	@Column(name="CourseId")
	private Integer courseId;
	
	@Column(name="PackName")
	private String packName;
	
	@Column(name="PackType")
	private String packType;
	
	@Column(name="Discount")
	private Integer discount;
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity=PackageDetailPojo.class,mappedBy="packagePojo")
	@Fetch(FetchMode.SUBSELECT)
	private List<PackageDetailPojo> packageDetails = null;

	public Integer getPackId() {
		return packId;
	}

	public void setPackId(Integer packId) {
		this.packId = packId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public List<PackageDetailPojo> getPackageDetails() {
		return packageDetails;
	}

	public void setPackageDetails(List<PackageDetailPojo> packageDetails) {
		this.packageDetails = packageDetails;
	}
	
	
	
	
}
