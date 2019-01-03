package com.ms.master.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ms.master.business.Genreator;
import com.ms.master.formbeans.StudentEduInfoFormBean;
import com.ms.master.formbeans.StudentPersonalInfoFormBean;
import com.ms.master.formbeans.StudentRegDocFormBean;
import com.ms.master.formbeans.leaveMasterbean;
import com.ms.master.pojos.studentpojos.StdFeeMasterPojo;
import com.ms.master.pojos.studentpojos.StudentDocPojo;
import com.ms.master.pojos.studentpojos.StudentEduPojo;
import com.ms.master.pojos.studentpojos.StudentRegPojo;
import com.ms.master.service.EmpService;
import com.ms.master.service.ProfileService;
import com.ms.master.service.StudentService;
import com.sun.tracing.dtrace.ModuleAttributes;

@Controller
@RequestMapping(value="/Master")
public class StudentProfileController {
	private static final String VIEW="student/"; 
	
	private final String IMG_FOLDER = "images/media/img";
	private final String PPT_FOLDER = "images/media/ppt";
	private final String FILE_FOLDER = "images/media/file";
	
	@Autowired
	private ProfileService ProService;
	
	@RequestMapping(value="/Ajax/LoadProfile",method=RequestMethod.POST)
	public  String loadProfilr(Integer regNo,Model map){
		//System.out.println("regNo"+regNo);
			StudentRegPojo sp=	ProService.getPersonalInfo(regNo);
			List<StudentEduPojo> ep=	ProService.getQualificationDetail(regNo);
			List<StudentDocPojo> dp=ProService.getDocDetails(regNo);
			map.addAttribute("regDetail", sp);
			map.addAttribute("eduDetail", ep);
			map.addAttribute("docDetail", dp);
		return VIEW+"ProfileDetail";
	}
	
	@RequestMapping(value="/Ajax/presonalInfoUpdate",method=RequestMethod.POST)
	public @ResponseBody String presonalInfoUpdate(@ModelAttribute StudentPersonalInfoFormBean StuPersonalBean){
		//System.out.println("regNo"+StuPersonalBean.getFname());
		ProService.presonalInfoUpdate(StuPersonalBean);
		return "ok";
	}
	
	@RequestMapping(value="/Ajax/avalon_img_upload",method=RequestMethod.POST)
	public @ResponseBody String uploadImage(String prefix, @RequestParam MultipartFile file, HttpSession session, HttpServletRequest req){
		//System.out.println("hello");
		if(prefix==null){prefix="";}
		String fileName=file.getOriginalFilename();
		String ext=fileName.substring(fileName.lastIndexOf('.')+1);
		fileName=prefix+Genreator.genreateFileId()+"."+ext;
        String appPath = session.getServletContext().getRealPath("");
        String realPath=appPath+File.separator+IMG_FOLDER;
		try{
			byte[] bytes = file.getBytes();
			 
            File dir = new File(realPath);
            if (!dir.exists())
                System.out.println(dir.mkdirs());
            File serverFile = new File(dir.getAbsolutePath()
                    + File.separator +fileName );
            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(serverFile));
            stream.write(bytes);
            stream.close();
           
		}catch(Exception e){
			System.out.println(e.getMessage());
			return "failed";
		}
		
		String url = session.getServletContext().getContextPath();
		url=url+"/"+IMG_FOLDER+"/"+fileName;
		return url;
	}
	
	@RequestMapping(value="/Ajax/StdDocumentUploads",method=RequestMethod.POST)
	public @ResponseBody String StdDocumentUpload(@ModelAttribute StudentRegDocFormBean StudentDoc){
		ProService.StdDocumentUpload(StudentDoc);
		return "ok";
	}
	
	@RequestMapping(value="/Ajax/updateStdEducationInfo",method=RequestMethod.POST)
	public @ResponseBody String updateStdEducationInfo(@ModelAttribute StudentEduInfoFormBean StudentEduInfo){
		ProService.updateStdEducationInfo(StudentEduInfo);
		return "ok";
	}
   
}
