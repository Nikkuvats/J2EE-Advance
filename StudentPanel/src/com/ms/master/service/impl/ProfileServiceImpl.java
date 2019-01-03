package com.ms.master.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ms.master.dao.ProfileDao;
import com.ms.master.formbeans.StudentEduInfoFormBean;
import com.ms.master.formbeans.StudentPersonalInfoFormBean;
import com.ms.master.formbeans.StudentRegDocFormBean;
import com.ms.master.pojos.studentpojos.StdFeeMasterPojo;
import com.ms.master.pojos.studentpojos.StudentDocPojo;
import com.ms.master.pojos.studentpojos.StudentEduPojo;
import com.ms.master.pojos.studentpojos.StudentRegPojo;
import com.ms.master.service.ProfileService;


public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileDao ProDao ;

	@Override
	public StudentRegPojo getPersonalInfo(Integer regNo) {
	return	ProDao.getPersonalInfo(regNo);
		
	}

	@Override
	public List<StudentEduPojo> getQualificationDetail(Integer regNo) {
		return ProDao.getEducationDetail(regNo);
		
	}

	@Override
	public List<StudentDocPojo> getDocDetails(Integer regNo) {
		return	ProDao.getDocDetails(regNo);
		
	}

	/*@Override
	public StdFeeMasterPojo getStudentFeeDetail(Integer regNo) {
		
		return ProDao.getStudentFeeDetail(regNo);
	}*/

	@Override
	public boolean presonalInfoUpdate(StudentPersonalInfoFormBean stuPersonalBean) {
		StudentRegPojo pPojo =ProDao.getPersonalDetail(stuPersonalBean);
		//StudentPersonalInfoFormBean pBean = stuPersonalBean.getPersonalInfoBean();
		pPojo.setcAddress(stuPersonalBean.getcAddress());
		pPojo.setcCity(stuPersonalBean.getcCity());
		pPojo.setcCountry(stuPersonalBean.getcCountry());
		pPojo.setCourseCompStatus(0);
		pPojo.setcPin(stuPersonalBean.getcPin());
		//pPojo.setBranchId(admin.getBranchId());
		//pPojo.setCreatedBy(admin.getEmployeeId());
		pPojo.setcState(stuPersonalBean.getcState());
		pPojo.setDob(stuPersonalBean.getDob());
		pPojo.setEmailId(stuPersonalBean.getEmailId());
		pPojo.setEmrgNo(stuPersonalBean.getEmrgNumber());
		pPojo.setFname(stuPersonalBean.getFname());
		pPojo.setGender(stuPersonalBean.getGender());
		pPojo.setLname(stuPersonalBean.getLname());
		pPojo.setMobile(stuPersonalBean.getMobile());
		pPojo.setpAddress(stuPersonalBean.getpAddress());
		pPojo.setpCity(stuPersonalBean.getpCity());
		pPojo.setpCountry(stuPersonalBean.getpCountry());
		pPojo.setpPin(stuPersonalBean.getpPin());
	//	pPojo.setBatchId(null);
		pPojo.setpState(stuPersonalBean.getpState());
		ProDao.presonalInfoUpdates(pPojo);
		return false;
	}

	@Override
	public boolean StdDocumentUpload(StudentRegDocFormBean studentDoc) {
		StudentDocPojo stdDoc =new StudentDocPojo();
		stdDoc.setStudentRegNo(studentDoc.getRegId());
		stdDoc.setDocName(studentDoc.getDocName());
		stdDoc.setDocUrl(studentDoc.getDocUrl());
		ProDao.StdDocumentUpload(stdDoc);
		return false;
	}

	@Override
	public boolean updateStdEducationInfo(StudentEduInfoFormBean studentEduInfo) {
		StudentEduPojo eduPojo =ProDao.getStdEducationInfo(studentEduInfo);
		eduPojo.setStudentRegNo(studentEduInfo.getStdRegNo());
		eduPojo.setCourseName(studentEduInfo.getCourseType());
		eduPojo.setRollNo(studentEduInfo.getRollNo());
		eduPojo.setUnvBoard(studentEduInfo.getUnvBoard());
		eduPojo.setBeginYear(Integer.parseInt(studentEduInfo.getBeginYear()));
		eduPojo.setEndYear(Integer.parseInt(studentEduInfo.getEndYear()));
		eduPojo.setProgram(studentEduInfo.getProgramType());
		eduPojo.setPercentage(studentEduInfo.getPercentage());
		ProDao.updateStdEducationInfo(eduPojo);
		return false;
	}

}
