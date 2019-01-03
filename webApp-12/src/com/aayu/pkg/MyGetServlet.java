package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet
public class MyGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyGetServlet() {
        super();
       
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		Enumeration<String> attr=req.getAttributeNames();
		StringBuilder sb=new StringBuilder();
		
		while(attr.hasMoreElements())
		{
			sb.append(attr.nextElement()+"<br/>");
			pw.println(sb);
		}
	}

}
