package com.ms.master.service;

import java.util.List;

import com.ms.master.formbeans.StudentEduInfoFormBean;
import com.ms.master.formbeans.StudentPersonalInfoFormBean;
import com.ms.master.formbeans.StudentRegDocFormBean;
import com.ms.master.pojos.studentpojos.StdFeeMasterPojo;
import com.ms.master.pojos.studentpojos.StudentDocPojo;
import com.ms.master.pojos.studentpojos.StudentEduPojo;
import com.ms.master.pojos.studentpojos.StudentRegPojo;

public interface ProfileService {

	StudentRegPojo getPersonalInfo(Integer regNo);

	List<StudentEduPojo> getQualificationDetail(Integer regNo);

	List<StudentDocPojo> getDocDetails(Integer regNo);

	//StdFeeMasterPojo getStudentFeeDetail(Integer regNo);

	boolean presonalInfoUpdate(StudentPersonalInfoFormBean stuPersonalBean);

	boolean StdDocumentUpload(StudentRegDocFormBean studentDoc);

	boolean updateStdEducationInfo(StudentEduInfoFormBean studentEduInfo);

	

}
