package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public First() {
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		System.out.println("aayu");
		pw.println("<form action='Second'>");
		pw.println("<input type='hidden' name='user' value='"+name+"'>");
        pw.println("<input type='submit' value='submit' >");
        pw.println("</form>");
		
	}
}
