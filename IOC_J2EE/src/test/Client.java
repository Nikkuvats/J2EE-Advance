package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Client {
	public static void main(String[] args) 
	{
		
		//find xml 	and create instanse
		
		ApplicationContext context=new ClassPathXmlApplicationContext("resource/spring.xml");
	}
}
