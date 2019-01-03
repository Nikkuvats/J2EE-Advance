package com.aayu.pkg;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyFilter implements Filter {

	public int count=0;
    public MyFilter() {
        
    }

	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String s=request.getParameter("password");
		if(s.equals("admin"))
			{
			System.out.println("yes now you ready to pass req to servlet");	
			chain.doFilter(request, response);
			}
		else
			{
			count++;
			if(count==3)
			{
				System.out.println("you have blocked");
				RequestDispatcher rd=request.getRequestDispatcher("HelloServlet");
				rd.forward(request, response);	
			}
			pw.println("username or password error");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);		
			}
		System.out.println(count);
	}

	
	private void close() {
		// TODO Auto-generated method stub
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

