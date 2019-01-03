package com.aayu.pkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Validate() {
     
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {	
    	response.setContentType("text/html");
    	String name=request.getParameter("user");
    	String pass=request.getParameter("pass");
    	System.out.println("hiiii");
    	if(pass.equals("12345"))
    	{
    		System.out.println("inside");
    		response.sendRedirect("First?username="+name+"");
    	}
    }
}
