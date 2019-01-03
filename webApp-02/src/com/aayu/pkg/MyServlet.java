package com.aayu.pkg;
import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;

public class MyServlet implements Servlet
{
ServletConfig config=null;

public void init(ServletConfig config)
	{
	this.config=config;
	System.out.println("servlet is initlized");	
	}
   public void service(ServletRequest req,ServletResponse res)throws IOException
    {
	   res.setContentType("text/html"); 
	    PrintWriter pw = res.getWriter(); 
	   String str=req.getRemoteAddr();
	   pw.println("fully IP"+str);
    }
   public void destroy()
   {
	 System.out.print("servlet is destroy");  
   }
   public ServletConfig getServletConfig()
   {
	 return config;  
   } 
   public String getServletInfo()
   {
	 return "aayush hihihi";  
   }   
}
