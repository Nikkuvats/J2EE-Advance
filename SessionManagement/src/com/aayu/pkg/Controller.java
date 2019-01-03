package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		
		HttpSession hs=request.getSession();	
		String fn=request.getParameter("fn");
		if(fn.equals("1"))
		{
		String name=request .getParameter("name");
		String fname=request .getParameter("fname");
		String mname=request .getParameter("mname");
		
		hs.setAttribute("name", name);
		hs.setAttribute("fname", fname);
		hs.setAttribute("mname", mname);
	    response.sendRedirect("./Form2.html");
		}
		
		if(fn.equals("2"))
		{
		String contact=request .getParameter("contact");
		String email=request .getParameter("email");
		String address=request .getParameter("address");
			
		hs.setAttribute("contact", contact);
		hs.setAttribute("email", email);
		hs.setAttribute("address", address);	
		response.sendRedirect("./Form3.html");	
		}
		
		if(fn.equals("3"))
		{
		String per=request .getParameter("per");
		String quel=request .getParameter("qul");
		
		hs.setAttribute("quel", quel);
		hs.setAttribute("per", per);
		
		String name=(String)hs.getAttribute("name");
		String fname=(String)hs.getAttribute("fname");
		String mname=(String)hs.getAttribute("mname");
		
		
		String contact=(String)hs.getAttribute("contact");
		String email=(String)hs.getAttribute("email");
		String address=(String)hs.getAttribute("address");

		
		String url="jdbc:mysql://localhost:3306/aadhar";
		String dname="root";
		String password="root";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,dname,password);
		   PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?)");
			
		   ps.setString(1, name);
		   ps.setString(2, fname);
		   ps.setString(3, mname);
		   ps.setString(4, contact);
		   ps.setString(5, email);
		   ps.setString(6, address);
		   ps.setString(7, quel);
		   ps.setString(8, per);
		
		int i=ps.executeUpdate();
		if(i!=0)
			{
			 out.println("Name:"+name);
			 out.println("Fname:"+fname);
			 out.println("Mname:"+mname);
			 out.println("Contact"+contact);
			 out.println("Email:"+email);
			 out.println("Address:"+address);
			 out.println("Quel:"+quel);
			 out.println("persentage:"+per);
			}
		
		else
			{
			out.println("fail");
			}
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
	}
  }
}
