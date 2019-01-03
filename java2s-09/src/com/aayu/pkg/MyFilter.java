package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
FilterConfig config;

	public MyFilter() {
    }
    
	public void init(FilterConfig config) throws ServletException {
		this.config=config;
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String s=config.getInitParameter("construction");
		
		if(s.equals("no"))
		{
			pw.println("this page is under construction");
		}
		else
		{
			chain.doFilter(request, response);
		}
	}
	
	public void destroy() {
		
	}
}
