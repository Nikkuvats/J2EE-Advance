package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Validate() {
        super();
     
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			String un=request.getParameter("name");
			String up=request.getParameter("password");
			
			System.out.println(un);
			System.out.println(up);
			if(up.equals("12345"))
			{
				System.out.println("Nikku"); 
				Cookie ck=new Cookie("username", un);
				response.addCookie(ck);
				response.sendRedirect("Welcome");
			}
	}

}
