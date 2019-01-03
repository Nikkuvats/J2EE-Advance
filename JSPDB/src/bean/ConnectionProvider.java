package bean;
import static bean.Provider.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection con=null;  
	static{  
	try{  
	Class.forName(username);  
	con=DriverManager.getConnection(url,name,password);  
	}catch(Exception e){}  
	}  
	  
	public static Connection getCon(){  
	    return con;  
	} 	
}
