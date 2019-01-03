package com.aayu.pkg;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("Bean.xml");

		     
		      context.start();
			  
		      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		      obj.getMessage();

		      context.stop();
		
	}	
}
