package com.aayu.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hw=context.getBean(HelloWorld.class);
		
		hw.setMessage("Hello Aayush");
		hw.getMessage();
		
	}

}
