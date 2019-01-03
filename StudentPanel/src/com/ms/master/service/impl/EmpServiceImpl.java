package com.ms.master.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.ms.master.dao.EmpDao;
import com.ms.master.employeebeans.StudentLoginBean;

import com.ms.master.pojos.studentpojos.StudentRegPojo;
import com.ms.master.service.EmpService;



@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpDao empDao;

	@Override
	public boolean secureLogin(String StudentName, Integer StudentIds,HttpSession session) {
		StudentRegPojo stdpojo = empDao.getStudent(StudentName);
		if(stdpojo!=null){
			if(stdpojo.getStudentId().equals(StudentName)){
				StudentLoginBean empBean = new StudentLoginBean();
				empBean.setStudentId(stdpojo.getStudentId());
				empBean.setStudentName(stdpojo.getFname());
				empBean.setRegNo(stdpojo.getStudentRegNo());
				empBean.setMobile(stdpojo.getMobile());
				session.setAttribute("admin", empBean);
				return true;
			}	
		}
		return false;
	}

/*	@Override
	public boolean secureLogin(String employeeId, String password, HttpSession session) {
		StudentRegPojo stdpojo = empDao.getStudent(employeeId);
		if(stdpojo!=null){
			if(stdpojo.getStudentId().equals(password)){
				EmployeeBean empBean = new EmployeeBean();
				empBean.setEmployeeId(stdpojo.getStudentId());
				empBean.setEmployeeName(stdpojo.getFname());
				//empBean.setBranchId(stdpojo.getBranchId());
				//session.setAttribute("admin", empBean);
				//session.setMaxInactiveInterval(60*60*24*10);
				return true;
			}	
		}
		return false;
	}*/

}
