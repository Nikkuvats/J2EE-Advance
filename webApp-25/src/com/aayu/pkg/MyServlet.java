package com.aayu.pkg;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MyServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("name");
		String s2=request.getParameter("password");
		
		String drivername="com.mysql.jdbc.Driver";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/webapp-25";
		
		try
		{
		Class.forName(drivername);
		Connection con=DriverManager.getConnection(url,username,password);
		java.sql.Statement st=con.createStatement();
		String query=("insert into data(name,pass) values('"+s1+"','"+s2+"')");
		int i=st.executeUpdate(query);
		if(i>0)
			{
			pw.print("Inserted successfully");
			}
		}
		catch (Exception e) 
		{
		pw.print("not Inserted");
		}
	}
}
