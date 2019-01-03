package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String drivername="com.mysql.jdbc.Driver";
    String username="root";
    String password="root";
    String url="jdbc:mysql://localhost:3306/database";

    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter pw=response.getWriter();
	try
	{
	response.setContentType("text/html");
	String query="insert into myservlet(name) value('aayush')";
	Class.forName(drivername);
	java.sql.Connection conn=DriverManager.getConnection(url,username,password);
	Statement s1=conn.createStatement();
	int i=s1.executeUpdate(query);
	if(i>0)
	{
		System.out.println("data inserted successfully");
		pw.println("inserted successfully");
	}
	}catch(Exception e){System.out.println(e.getMessage());
		pw.println("not inserted");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
