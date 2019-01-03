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

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		String drivername="com.mysql.jdbc.Driver";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/jdbc3";
	
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
			
			Class.forName(drivername);
			Connection conn=DriverManager.getConnection(url,username,password);
			Statement st=conn.createStatement();
			
			String query=("SELECT id,name,email,password FROM myservlet");
			
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
			int i=rs.getInt("id");
			String s1=rs.getString("name");
			String s2=rs.getString("email");
			String s3=rs.getString("password");
		
			pw.println("<html><body>Name : "+s1+"<br> Password: "+s3+"<br> Email: "+s2+"</body></html>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
