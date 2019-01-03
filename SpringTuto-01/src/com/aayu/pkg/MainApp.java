package com.aayu.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		HelloWorld obj=(HelloWorld) context.getBean("d");
		obj.getName();
		obj.setName("Anant");
		
		HelloWorld obj2=(HelloWorld) context.getBean("d");
		obj2.getName();
		obj2.setName("K.p");
		obj2.getName();
		
		HelloWorld obj3=(HelloWorld) context.getBean("d");
		obj3.getName();
	}
}
