package com.aayu.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao edao=(EmployeeDao) ctx.getBean("edao");
		int status=edao.saveEmployee(new Employee(102,"Aayush",15000));
		System.out.println(status);
	}	
}
