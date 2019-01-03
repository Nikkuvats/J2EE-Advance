package com.ms.master.controllers;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ms.master.employeebeans.StudentLoginBean;
import com.ms.master.formbeans.leaveMasterbean;
import com.ms.master.formbeans.stdCertificatbean;
import com.ms.master.pojos.masterpojos.BreakMasterPojo;
import com.ms.master.pojos.masterpojos.leaveMasterPojo;
import com.ms.master.pojos.profilepojos.CertificatePojo;
import com.ms.master.pojos.studentpojos.StdCertiMasterPojo;
import com.ms.master.pojos.studentpojos.StdCoursePojo;
import com.ms.master.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService strService;
	
	@RequestMapping(value="/Master/Ajax/applyleaveinfo",method=RequestMethod.POST)
	public @ResponseBody String leaveApplyInfo(@ModelAttribute leaveMasterbean lavebean,HttpSession session,Model map)
	{     
		 StudentLoginBean stdbean=(StudentLoginBean)session.getAttribute("admin");
		 lavebean.setStudentRegNo(stdbean.getRegNo());
		
		 if(strService.applyLeaveSubmit(lavebean)){
			 return "ok";
		 }
		 else{
			return "You have already applied leave in this date which are pending"; 
		 }
		 	
	}
	@RequestMapping(value="/Master/Ajax/applybreakinfo",method=RequestMethod.POST)
	public @ResponseBody String breakApplyInfo(@ModelAttribute leaveMasterbean leavbeen, HttpSession session)
	{
		StudentLoginBean been=(StudentLoginBean)session.getAttribute("admin");
		leavbeen.setStudentRegNo(been.getRegNo());
		if(strService.applyBreakSubmit(leavbeen)){
			return "ok";
		}
		else{
			return "You have already applied break in this date which are pending";
		}
		
	}
	@RequestMapping(value="/Master/Ajax/loadleavebreak",method=RequestMethod.POST)
	public String loadleaveDetail(Integer regNo, Model map)
	{
		 Set<leaveMasterPojo> list=null;
		 
		 List<leaveMasterPojo> leve=strService.getshowLeave(regNo);
		 
			 
				 
				 for (leaveMasterPojo leavePojo : leve)
				 {
					 list = new LinkedHashSet<>();
	                 list.add(leavePojo);
			     }
		     
		 
	     System.out.println("Set:"+list.size());
		 map.addAttribute("leavList", list);
		 
		 List<BreakMasterPojo> brak=strService.getshowBreak(regNo);
		 map.addAttribute("brekList", brak);
		 return "student/LeaveBreak";
	}
	
	@RequestMapping(value="/Master/Ajax/loadCertificate",method=RequestMethod.POST)
	public String loadCertificateDetail(Integer regNo,Model map,HttpSession session)
	{
		List<StdCertiMasterPojo> certpojo=strService.getCertificateDetail(regNo);
		map.addAttribute("certiList", certpojo);
		List<CertificatePojo> certName=strService.loadCertificateName();
		ServletContext ctx=session.getServletContext();
		ctx.setAttribute("certicateName", certName);
		return "student/Certificate";
	}
	@RequestMapping(value="/Master/Ajax/applyCertificate",method=RequestMethod.POST)
	public @ResponseBody String loadCertificateName(@ModelAttribute stdCertificatbean cerbean,HttpSession session)
	{
		 StudentLoginBean stdbean=(StudentLoginBean)session.getAttribute("admin");
		 cerbean.setStudentRegNo(stdbean.getRegNo());
		 strService.applyCertificate(cerbean);
		 return "ok";
	}
	@RequestMapping(value="/Master/Ajax/loadFeeDetails",method=RequestMethod.POST)
	public String loadfeeDetail(Integer regNo,Model map)
	{
		//System.out.println("no"+regNo);
		List<StdCoursePojo> stdlist=strService.getCourseList(regNo);
		map.addAttribute("courselist", stdlist);
		return "student/FeeDetail";
	}
}
