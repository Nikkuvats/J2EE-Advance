package com.aayu.pkg;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Test2 implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent hse) {
	
		System.out.println("on session creation");
		
	}

	public void sessionDestroyed(HttpSessionEvent hse) {
	
		System.out.println("on session invalidate");
		
	}  
}
