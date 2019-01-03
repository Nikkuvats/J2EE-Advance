package com.ms.master.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import com.ms.master.business.Genreator;
import com.ms.master.dao.StudentDao;
import com.ms.master.formbeans.leaveMasterbean;
import com.ms.master.formbeans.stdCertificatbean;
import com.ms.master.pojos.masterpojos.BreakMasterPojo;
import com.ms.master.pojos.masterpojos.leaveMasterPojo;
import com.ms.master.pojos.profilepojos.CertificatePojo;
import com.ms.master.pojos.studentpojos.StdCertiMasterPojo;
import com.ms.master.pojos.studentpojos.StdCoursePojo;
import com.ms.master.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao stuntDao;
	
	@Override
	public boolean applyLeaveSubmit(leaveMasterbean lavebean) {
		List<leaveMasterPojo> list = stuntDao.getLeave(lavebean.getStudentRegNo(),lavebean.getStartDate(),lavebean.getEndDate());
		if(list.size()==0)
		{
			Integer days=Genreator.calculateDays(lavebean.getStartDate(), lavebean.getEndDate());
			System.out.println("Days="+days);
			for(int i=0;i<=days;i++)
			{
				leaveMasterPojo pojo=new leaveMasterPojo();
				
				pojo.setLeaveId(lavebean.getLeaveId());
				pojo.setStudentRegNo(lavebean.getStudentRegNo());
				pojo.setDate(Genreator.addDays(lavebean.getStartDate(), i));
				pojo.setStratDate(lavebean.getStartDate());
				pojo.setEndDate(lavebean.getEndDate());
				pojo.setNodays(lavebean.getNodays());
				pojo.setLeaveType(lavebean.getLeaveType());
				pojo.setReason(lavebean.getReason());
				pojo.setStatus(lavebean.getStatus());
				stuntDao.getApplyleave(pojo);
		    }
			return true;
		}
		else
		{
		    return false;
		}
	}
	/*@Override
	public Set<leaveMasterPojo> getshowLeave(Integer regNo) {
		return stuntDao.getshowLeave(regNo);
	}*/

	@Override
	public List<StdCertiMasterPojo> getCertificateDetail(Integer regNo) {
	
		return stuntDao.getCertificateInfo(regNo);
	}

	@Override
	public List<CertificatePojo> loadCertificateName() {
		
		return stuntDao.loadCertificateName();
	}

	@Override
	public boolean applyCertificate(stdCertificatbean cerbean) 
	{
		StdCertiMasterPojo cerpojo=new StdCertiMasterPojo();
		cerpojo.setStdCertId(cerbean.getStdCertId());
		cerpojo.setStudentRegNo(cerbean.getStudentRegNo());
		cerpojo.setCertificateId(cerbean.getCertificateId());
		cerpojo.setStatus(cerbean.getStatus());
		cerpojo.setAppliedDate(Genreator.getCurrentDateInStr());
		cerpojo.setIssuNo(cerbean.getIssuNo());
		stuntDao.applyCertificate(cerpojo);
		return true;
	}
	@Override
	public boolean applyBreakSubmit(leaveMasterbean leavbeen) {
		BreakMasterPojo brpojo=new BreakMasterPojo();
		brpojo.setBreakId(leavbeen.getLeaveId());
		brpojo.setStudentRegNo(leavbeen.getStudentRegNo());
		brpojo.setStratDate(leavbeen.getStartDate());
		brpojo.setEndDate(leavbeen.getEndDate());
		brpojo.setNodays(leavbeen.getNodays());
		brpojo.setLeaveType(leavbeen.getLeaveType());
		brpojo.setReason(leavbeen.getReason());
		brpojo.setStatus(leavbeen.getStatus());
		stuntDao.getApplybreak(brpojo);
		return true;
	}
	@Override
	public List<BreakMasterPojo> getshowBreak(Integer regNo) {
		
		return stuntDao.getshowBreak(regNo);
	}

	@Override
	public List<leaveMasterPojo> getshowLeave(Integer regNo) {

		return stuntDao.getshowLeave(regNo);
	}

	@Override
	public List<StdCoursePojo> getCourseList(Integer regNo) {
		// TODO Auto-generated method stub
		return stuntDao.getcourseList(regNo);
	}

}
