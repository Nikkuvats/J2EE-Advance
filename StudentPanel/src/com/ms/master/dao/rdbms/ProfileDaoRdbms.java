package com.ms.master.dao.rdbms;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.ms.master.dao.ProfileDao;
import com.ms.master.formbeans.StudentEduInfoFormBean;
import com.ms.master.formbeans.StudentPersonalInfoFormBean;
import com.ms.master.pojos.studentpojos.StdFeeMasterPojo;
import com.ms.master.pojos.studentpojos.StudentDocPojo;
import com.ms.master.pojos.studentpojos.StudentEduPojo;
import com.ms.master.pojos.studentpojos.StudentRegPojo;

public class ProfileDaoRdbms extends DBConnectionDao implements ProfileDao{

	@Override
	public StudentRegPojo getPersonalInfo(Integer regNo) {

		return hibernateTemplate.get(StudentRegPojo.class, regNo);
	}

	@Override
	public  List<StudentEduPojo> getEducationDetail(Integer regNo) {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(StudentEduPojo.class);
		List<StudentEduPojo> sep=hibernateTemplate.findByCriteria(criteria.add(Restrictions.eq("studentRegNo", regNo)));
		//System.out.println(sep.size());
		return sep;
	}

	@Override
	public List<StudentDocPojo> getDocDetails(Integer regNo) {
		DetachedCriteria criteria = DetachedCriteria.forClass(StudentDocPojo.class);
		List<StudentDocPojo> sep=hibernateTemplate.findByCriteria(criteria.add(Restrictions.eq("studentRegNo", regNo)));
		return sep;
	}

	/*@Override
	public StdFeeMasterPojo getStudentFeeDetail(Integer regNo) {
		StdFeeMasterPojo stdPojo = null;
		DetachedCriteria cre =DetachedCriteria.forClass(StdFeeMasterPojo.class);
		List<StdFeeMasterPojo> stdList = hibernateTemplate.findByCriteria(cre.add(Restrictions.eq("studentRegNo", regNo)));
		//System.out.println("size "+stdList.size());
		if(stdList.size()==0){
			return stdPojo;
		}
		else{
			stdPojo = stdList.get(0);
			 return stdPojo ;
		}

	}*/

	@Override
	public StudentRegPojo getPersonalDetail(StudentPersonalInfoFormBean stuPersonalBean) {
		return hibernateTemplate.get(StudentRegPojo.class, stuPersonalBean.getRegId());
	}

	@Override
	public boolean presonalInfoUpdates(StudentRegPojo pPojo) {
		hibernateTemplate.update(pPojo);
		return false;
	}

	@Override
	public boolean StdDocumentUpload(StudentDocPojo stdDoc) {
		hibernateTemplate.save(stdDoc);
		return false;
	}

	@Override
	public StudentEduPojo getStdEducationInfo(StudentEduInfoFormBean studentEduInfo) {
		return hibernateTemplate.get(StudentEduPojo.class, studentEduInfo.getQualificationId());
	}

	@Override
	public boolean updateStdEducationInfo(StudentEduPojo eduPojo) {
		hibernateTemplate.update(eduPojo);
		return false;
	}}
