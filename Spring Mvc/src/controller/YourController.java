package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YourController {
	@RequestMapping("baye")
	public String getHome(){
		return "Home";
	}
}
