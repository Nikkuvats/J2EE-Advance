package com.aayu.pkg;
import static com.aayu.pkg.Provider.*;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
private static Connection con=null;
static
	{
	try {
		Class.forName(drivername);
		con=DriverManager.getConnection(url,name,password);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	public static Connection getCon() {
		return con;
	}
	
}
