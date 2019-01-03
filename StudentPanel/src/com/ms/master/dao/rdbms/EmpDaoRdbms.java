package com.ms.master.dao.rdbms;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


import com.ms.master.dao.EmpDao;
import com.ms.master.pojos.studentpojos.StudentRegPojo;


@Repository
public class EmpDaoRdbms extends DBConnectionDao implements EmpDao{

	@Override
	public StudentRegPojo getStudent(String StudentName) {
		StudentRegPojo stdPojo = null;
		DetachedCriteria cre =DetachedCriteria.forClass(StudentRegPojo.class);
		List<StudentRegPojo> stdList = hibernateTemplate.findByCriteria(cre.add(Restrictions.eq("studentId", StudentName)));
		//System.out.println("size "+stdList.size());
		if(stdList.size()==0){
			return stdPojo;
		}
		else{
			stdPojo = stdList.get(0);
			 return stdPojo ;
		}
		
	}

/*	@Override
	public StudentRegPojo getStudent(Integer employeeId) {
		return hibernateTemplate.get(StudentRegPojo.class, employeeId);
	}
*/




}
