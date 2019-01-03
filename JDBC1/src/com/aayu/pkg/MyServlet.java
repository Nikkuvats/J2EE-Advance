package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String drivername="com.mysql.jdbc.Driver";
	String username="root";
	String password="root";
	String url="jdbc:mysql://localhost:3306/jdbc1";
	
   
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	
	try
		{
		String n=request.getParameter("name");
		String p=request.getParameter("password");
		Class.forName(drivername);
		Connection con=DriverManager.getConnection(url,username,password);
		Statement s1=con.createStatement();
		String query=("insert into myservlet(name,pass) values('"+n+"','"+p+"')");
		
		//pw.println();
		int i=s1.executeUpdate(query);
		if(i>0)
			{
				pw.println("inserted successfully");
			}
		
		}catch(Exception e)
			{
				pw.println("not insterted");
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
