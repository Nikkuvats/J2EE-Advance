package com.ms.master.pojos.profilepojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="certificateDetail")
public class CertificatePojo {
	
	@Id
	@GeneratedValue
	
	@Column(name="CertDtailId")
	private Integer certDtailId;
	
	@Column(name="CertificateName")
	private String certificateName;

	public Integer getCertDtailId() {
		return certDtailId;
	}

	public void setCertDtailId(Integer certDtailId) {
		this.certDtailId = certDtailId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	
}
