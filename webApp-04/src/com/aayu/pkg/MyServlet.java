package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet
{
	ServletConfig config=null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("servlet is initiliazed");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	res.getContentType();
	PrintWriter pw=res.getWriter();
	String s=req.getParameter("name");
	pw.println("name is "+s);
	System.out.println("service execute");
	}
	
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("servlet config");
		return config;
	}



	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("info");
		return "ok";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("servlet is destroy");
	}
}