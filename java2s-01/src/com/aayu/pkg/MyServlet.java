package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

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
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>hello world</title></head>");
		pw.println("<body>");
		pw.println("<Big>Hello world</Big>");
		pw.println("</body");
		pw.println("</html>");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
