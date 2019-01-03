package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import services.TestService;

@Controller
public class MyController {
	
	TestService testService = null;
	@Autowired
	public void setTestService(TestService testService) {
		System.out.println("Service Object Is Created");
		this.testService = testService;
	}
	@RequestMapping("Login")
	public ModelAndView login()
	{
		testService.Test();
		System.out.println("This Is Action Method");
		return new ModelAndView("Login");
	}
	
	@RequestMapping("Log")
	public ModelAndView log(Model map,String name, String pass,HttpServletRequest req)
	{
		// HttpServletRequest
		/*req.setAttribute("user", "i am jai");
		map.addAttribute("name", name); 
		map.addAttribute("pass", pass);
		return new ModelAndView("Login");
		*/
		
		// Display one object
		/*System.out.println(name+" "+pass);
		return new ModelAndView("Login","name", name); // By this we display only one object
		*/
		
		// Model map 
		/*map.addAttribute("name", name); // Model class is used for display multiple object
		map.addAttribute("pass", pass);
		return new ModelAndView("Login");
		*/
		
		// Array List
		ArrayList<String> al = new ArrayList<String>();
		req.setAttribute("user", "i am jai");
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		map.addAttribute("name", name); 
		map.addAttribute("pass", pass);
		return new ModelAndView("Login","al",al);
	}

		
}
