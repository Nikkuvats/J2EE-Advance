package com.aayu.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LoginDao {

	public static boolean Validate(String sn, String sp) {
	
		String username="com.mysql.jdbc.Driver";
		String name="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/result";
		
		try
		{
			Class.forName(username);
			Connection conn=DriverManager.getConnection(url,name,password);
			Statement st=conn.createStatement();
			String query="";
			
		}catch(Exception e)
		{}
		
		
		
		
		
		
		
		
		
		
		return false;
	}

}
