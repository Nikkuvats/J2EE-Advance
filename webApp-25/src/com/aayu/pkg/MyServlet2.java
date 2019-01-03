package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet2() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	String drivername="com.mysql.jdbc.Driver";
	String username="root";
	String password="root";
	String url="jdbc:mysql://localhost:3306/webapp-25";
	
	
	try {
		Class.forName(drivername);
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		String query=("select * from data");
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			pw.print("<table width=20% border=1>");
			pw.print("<tr><td>"+rs.getInt(1)+"</td>");
			pw.print("<td>"+rs.getString(2)+"</td>");
			pw.print("<td>"+rs.getString(3)+"</td></tr></table>");
		}
		
	} catch (Exception e) 
		{
		pw.print("data not retrived");
		}
    
      finally
      {
    	  pw.close();
      }  
	}
}
