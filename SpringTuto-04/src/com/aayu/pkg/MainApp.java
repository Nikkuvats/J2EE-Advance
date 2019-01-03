package com.aayu.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld ob1=(HelloWorld) context.getBean("HelloWorld");
		
		ob1.getMessage1();
		ob1.getMessage2();
		
		HelloIndia ob2=(HelloIndia) context.getBean("HelloIndia");
		ob2.getMessage1();
		ob2.getMessage2();
		ob2.getMessage3();
	}
}
