package com.aayu.pkg;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class Test1 implements ServletContextListener {

  
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("context init");
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("context destroy");
		
	}
}
