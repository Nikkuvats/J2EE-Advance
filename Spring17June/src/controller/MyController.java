package controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.TestService;

@Controller
public class MyController {
	TestService testService=null;
	
	@Autowired
	public void setTestService(TestService testService) {
		System.out.println("service object created");
		this.testService = testService;
	}
	
	@RequestMapping("welcome")
	public ModelAndView welcome()
	{
		return new ModelAndView("Welcome");
	}


	@RequestMapping("home")
	public ModelAndView home()
	{
		testService.show();
		
		return new ModelAndView("Home");
	}

}
