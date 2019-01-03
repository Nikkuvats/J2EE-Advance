package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			out.println("<H1>This is a password protected resource</H1>");
			out.println("<PRE>");
			out.println("User Name: " + request.getRemoteUser());
			String name = (request.getUserPrincipal() == null) ? null : request.getUserPrincipal().getName();
			out.println("Principal name:"+name);
			out.println("Authentication type:"+request.getAuthType());
			out.println("is a manager:"+request.isUserInRole("manager"));
			out.println("</pre>");
			out.println("</body></html>");
	}
}
