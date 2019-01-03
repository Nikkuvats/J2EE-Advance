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
    String url="jdbc:mysql://localhost:3306/jdbc2";
	
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
		
		try {
		String na=request.getParameter("fname");
		String mn=request.getParameter("mname");
		String ln=request.getParameter("lname");
		String mobile=request.getParameter("mob");
		String id=request.getParameter("email");
		String deptt=request.getParameter("dept");
		String idpass=request.getParameter("pass");
		
		
			Class.forName(drivername);
			Connection conn=DriverManager.getConnection(url,username,password);
			Statement st=conn.createStatement();
			String query=("insert into myservlet(fname,mname,lname,mob,email,department,unic) "
					+ "values('"+na+"','"+mn+"','"+ln+"','"+mobile+"','"+id+"','"+deptt+"','"+idpass+"')");
			System.out.println(na);
			System.out.println(mn);
			System.out.println(ln);
			System.out.println(mobile);
			System.out.println(id);
			System.out.println(deptt);
			System.out.println(idpass);
			
			
			int i=st.executeUpdate(query);
			
				pw.println("inserted successfully");
		
		} catch (Exception e) {
			e.getMessage();
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
