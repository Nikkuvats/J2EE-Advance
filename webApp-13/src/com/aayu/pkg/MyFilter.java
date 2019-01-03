package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//import sun.security.Config;

@WebFilter 
public class MyFilter implements Filter {
	
    public MyFilter() {
     
    }
    public void init(FilterConfig fConfig) throws ServletException {
	
    	String testParam=fConfig.getInitParameter("test-param");
    	System.out.println("test-param"+testParam);
    	
    }
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		String ipAddress=request.getRemoteAddr();
		System.out.println("IP "+ipAddress+",Time"+new Date()+"");
		
		chain.doFilter(request, response);

	}
	
    public void destroy() {
		
	}

}
