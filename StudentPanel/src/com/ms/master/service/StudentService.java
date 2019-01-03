package com.ms.master.service;


import java.util.List;
import java.util.Set;

import com.ms.master.formbeans.leaveMasterbean;
import com.ms.master.formbeans.stdCertificatbean;
import com.ms.master.pojos.masterpojos.BreakMasterPojo;
import com.ms.master.pojos.masterpojos.leaveMasterPojo;
import com.ms.master.pojos.profilepojos.CertificatePojo;
import com.ms.master.pojos.studentpojos.StdCertiMasterPojo;
import com.ms.master.pojos.studentpojos.StdCoursePojo;

public interface StudentService {
	
   boolean applyLeaveSubmit(leaveMasterbean lavebean);
   //Set<leaveMasterPojo> getshowLeave(Integer regNo);
   List<StdCertiMasterPojo> getCertificateDetail(Integer regNo);
   List<CertificatePojo> loadCertificateName();
   boolean applyCertificate(stdCertificatbean cerbean);
   boolean applyBreakSubmit(leaveMasterbean leavbeen);
   List<BreakMasterPojo> getshowBreak(Integer regNo);
   List<leaveMasterPojo> getshowLeave(Integer regNo);
   List<StdCoursePojo> getCourseList(Integer regNo);
}
