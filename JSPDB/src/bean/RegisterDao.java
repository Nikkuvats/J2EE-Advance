package bean;

import bean.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

public static int register(User u) throws SQLException {
	int status=0;
	
	Connection con=ConnectionProvider.getCon();
	PreparedStatement ps=con.prepareStatement("insert into registeruser(name,password,email) values(?,?,?)");
	ps.setString(1, u.getUname());
	ps.setString(2, u.getUpass());
	ps.setString(3, u.getUemail());
	
	status=ps.executeUpdate();
	return status;
 } 
}