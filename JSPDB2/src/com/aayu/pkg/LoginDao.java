package com.aayu.pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public static boolean validate(LoginBean bean){
	boolean status=false;
	try
	{
		Connection con=ConnectionProvider.getCon();
		PreparedStatement ps=con.prepareStatement("select from loginuser where email=? and pass=?");
		ps.setString(1,bean.getEmail());
		ps.setString(2,bean.getPassword());
		
		ResultSet rs=ps.executeQuery();
		status=rs.next();
	}catch(Exception e){}
	return status;
  }
}
