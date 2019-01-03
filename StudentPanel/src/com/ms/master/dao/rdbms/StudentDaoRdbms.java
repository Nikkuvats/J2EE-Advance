package com.ms.master.dao.rdbms;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

import com.ms.master.dao.StudentDao;
import com.ms.master.pojos.masterpojos.BreakMasterPojo;
import com.ms.master.pojos.masterpojos.leaveMasterPojo;
import com.ms.master.pojos.profilepojos.CertificatePojo;
import com.ms.master.pojos.studentpojos.StdCertiMasterPojo;
import com.ms.master.pojos.studentpojos.StdCoursePojo;

public class StudentDaoRdbms extends DBConnectionDao implements StudentDao
{

	@Override
	public boolean getApplyleave(leaveMasterPojo lavepojo) {
		
	    hibernateTemplate.save(lavepojo);
	    return true;
	}

	
	/*@Override
	public Set<leaveMasterPojo> getshowLeave(Integer regNo) {
		
		DetachedCriteria ctrea=DetachedCriteria.forClass(leaveMasterPojo.class);
		ctrea.add(Restrictions.eq("studentRegNo", regNo));
		List<leaveMasterPojo> list= hibernateTemplate.findByCriteria(ctrea);
		Set<leaveMasterPojo> list1= (Set<leaveMasterPojo>) list;
		return list1;
		  
	}*/
    
	@Override
	public List<StdCertiMasterPojo> getCertificateInfo(Integer regNo) {
		DetachedCriteria ctrea=DetachedCriteria.forClass(StdCertiMasterPojo.class);
		ctrea.add(Restrictions.eq("studentRegNo", regNo));
		return hibernateTemplate.findByCriteria(ctrea);
	}

	@Override
	public List<CertificatePojo> loadCertificateName() {
		DetachedCriteria ctrea=DetachedCriteria.forClass(CertificatePojo.class);
		return hibernateTemplate.findByCriteria(ctrea);
	}

	@Override
	public boolean applyCertificate(StdCertiMasterPojo cerpojo) {
		hibernateTemplate.save(cerpojo);
		return true;
	}

	@Override
	public List<leaveMasterPojo> getLeave(Integer studentRegNo, Date startDate,Date endDate) {
		DetachedCriteria ctrea=DetachedCriteria.forClass(leaveMasterPojo.class);
		ctrea.add(Restrictions.eq("studentRegNo", studentRegNo));
		ctrea.add(Restrictions.between("date", startDate,endDate));
		return hibernateTemplate.findByCriteria(ctrea);
	}

	@Override
	public boolean getApplybreak(BreakMasterPojo brpojo) {
		hibernateTemplate.save(brpojo);
		return true;
	}

	@Override
	public List<BreakMasterPojo> getshowBreak(Integer regNo) {
		DetachedCriteria ctrea=DetachedCriteria.forClass(BreakMasterPojo.class);
		ctrea.add(Restrictions.eq("studentRegNo", regNo));
		return hibernateTemplate.findByCriteria(ctrea);
	}

	@Override
	public List<leaveMasterPojo> getshowLeave(Integer regNo) {
		DetachedCriteria ctrea=DetachedCriteria.forClass(leaveMasterPojo.class);
		
		/* ProjectionList prolist = Projections.projectionList();
		 prolist.add(Projections.distinct(Projections.property("stratDate")));
		 prolist.add(Projections.property("endDate"));
		 prolist.add(Projections.property("nod"));
		 prolist.add(Projections.property("reason"));
		 prolist.add(Projections.property("leaveType"));
		 prolist.add(Projections.property("status"));
		 ctrea.setProjection(prolist);
		 ctrea.setResultTransformer(Transformers.aliasToBean(String.class));*/
		 
		 ctrea.add(Restrictions.eq("studentRegNo", regNo));
		 return hibernateTemplate.findByCriteria(ctrea);
	}


	@Override
	public List<StdCoursePojo> getcourseList(Integer regNo) {
		DetachedCriteria ctrea=DetachedCriteria.forClass(StdCoursePojo.class);
		ctrea.add(Restrictions.eq("studentRegNo", regNo));
		return hibernateTemplate.findByCriteria(ctrea);
	}

	

	/*ProjectionList projList = Projections.projectionList();
	projList.add(Projections.property("state"));
	projList.add(Projections.property("uspsCity"));
	criteria.setProjection(Projections.distinct(projList));*/
	
}
