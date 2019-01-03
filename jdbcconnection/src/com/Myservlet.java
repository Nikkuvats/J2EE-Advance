package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String driverName = "com.mysql.jdbc.Driver";
    String username = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306/myservlet";
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		try{
			response.setContentType("text/html");
			String query="insert into mynewservlet(name) value('anant')";
			Class.forName(driverName);
			java.sql.Connection conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			int i = st.executeUpdate(query);
			if(i>0){
				System.out.println("Data inserted");
				pw.println("Data Successfuly Inserted");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			pw.println("data not inserted");
		}
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
