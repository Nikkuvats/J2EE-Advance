package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Welcome() {
        super();
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		System.out.println("hii");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie[] cks=request.getCookies();
		out.println("welcome :"+cks[0].getValue());
	}
}
