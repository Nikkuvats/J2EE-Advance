package com.ms.master.formbeans;

public class StudentRegFormBean {
	
	private StudentPersonalInfoFormBean personalInfoBean;
	private StudentEduInfoFormBean[] eduInfoBeans;
	//private FeeCalculationDataBean feeDataBean;
	private StudentRegDocFormBean[] documents;
	
	public StudentPersonalInfoFormBean getPersonalInfoBean() {
		return personalInfoBean;
	}
	public void setPersonalInfoBean(StudentPersonalInfoFormBean personalInfoBean) {
		this.personalInfoBean = personalInfoBean;
	}
	public StudentEduInfoFormBean[] getEduInfoBeans() {
		return eduInfoBeans;
	}
	public void setEduInfoBeans(StudentEduInfoFormBean[] eduInfoBeans) {
		this.eduInfoBeans = eduInfoBeans;
	}
/*	public FeeCalculationDataBean getFeeDataBean() {
		return feeDataBean;
	}
	public void setFeeDataBean(FeeCalculationDataBean feeDataBean) {
		this.feeDataBean = feeDataBean;
	}*/
	public StudentRegDocFormBean[] getDocuments() {
		return documents;
	}
	public void setDocuments(StudentRegDocFormBean[] documents) {
		this.documents = documents;
	}
	
	
}
