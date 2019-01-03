package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
			out.println("Request headers");
			Enumeration name=request.getHeaderNames();
			while(name.hasMoreElements())
			{
				String names=(String) name.nextElement();
				Enumeration values=request.getHeaders(names);
				out.println(values);
				if (values != null) {
			        while (values.hasMoreElements()) {
			          String value = (String) values.nextElement();
			          out.println(name + ": " + value);
			        }
			      }
			}
	}
}
