package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	String username="com.mysql.jdbc.Driver";
	String name="root";
	String password="root";
	String url="jdbc:mysql://localhost:3306/registeruser";
	
    public MyServlet() {
        super();  
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String s1=request.getParameter("name");
		String s2=request.getParameter("pass");
		String s3=request.getParameter("email");
		String s4=request.getParameter("country");
		
		try {
		
			Class.forName(username);
			Connection conn=DriverManager.getConnection(url,name,password);
			Statement st=conn.createStatement();
			String query="INSERT INTO myservlet(name,pass,email,country) values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
			int i=st.executeUpdate(query);
			System.out.println("hii");
			if(i>0)
			{
				pw.println("you have successfully registered");
			}
		} catch (Exception e) {
			e.printStackTrace();
			pw.println("not inserted");
		}
	}
}
