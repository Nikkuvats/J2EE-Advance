package com.ms.master.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.ms.master.pojos.masterpojos.BreakMasterPojo;
import com.ms.master.pojos.masterpojos.leaveMasterPojo;
import com.ms.master.pojos.profilepojos.CertificatePojo;
import com.ms.master.pojos.studentpojos.StdCertiMasterPojo;
import com.ms.master.pojos.studentpojos.StdCoursePojo;

public interface StudentDao {
  boolean getApplyleave(leaveMasterPojo lavepojo);
  //Set<leaveMasterPojo> getshowLeave(Integer regNo);
  List<StdCertiMasterPojo> getCertificateInfo(Integer regNo);
  List<CertificatePojo> loadCertificateName();
  boolean applyCertificate(StdCertiMasterPojo cerpojo);
  List<leaveMasterPojo> getLeave(Integer studentRegNo, Date startDate,Date endDate);
  boolean getApplybreak(BreakMasterPojo brpojo);
  List<BreakMasterPojo> getshowBreak(Integer regNo);
  List<leaveMasterPojo> getshowLeave(Integer regNo);
  List<StdCoursePojo> getcourseList(Integer regNo);
}
