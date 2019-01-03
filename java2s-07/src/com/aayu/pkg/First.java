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
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("aa gaya first p");
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String user=request.getParameter("username");
			pw.println("welcome :"+user);
	}
}
