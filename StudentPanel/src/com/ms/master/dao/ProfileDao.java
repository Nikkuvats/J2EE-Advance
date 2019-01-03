package com.ms.master.dao;

import java.util.List;

import com.ms.master.formbeans.StudentEduInfoFormBean;
import com.ms.master.formbeans.StudentPersonalInfoFormBean;
import com.ms.master.pojos.studentpojos.StdFeeMasterPojo;
import com.ms.master.pojos.studentpojos.StudentDocPojo;
import com.ms.master.pojos.studentpojos.StudentEduPojo;
import com.ms.master.pojos.studentpojos.StudentRegPojo;

public interface ProfileDao {

	StudentRegPojo getPersonalInfo(Integer regNo);

	List<StudentEduPojo> getEducationDetail(Integer regNo);

	List<StudentDocPojo> getDocDetails(Integer regNo);

	//StdFeeMasterPojo getStudentFeeDetail(Integer regNo);

	StudentRegPojo getPersonalDetail(StudentPersonalInfoFormBean stuPersonalBean);

	boolean presonalInfoUpdates(StudentRegPojo pPojo);

	boolean StdDocumentUpload(StudentDocPojo stdDoc);

	StudentEduPojo getStdEducationInfo(StudentEduInfoFormBean studentEduInfo);

	boolean updateStdEducationInfo(StudentEduPojo eduPojo);
	

}
