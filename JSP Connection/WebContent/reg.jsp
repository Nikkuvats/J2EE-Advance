<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
PrintWriter pw=response.getWriter();
int id=Integer.parseInt(request.getParameter("id")); 
String name=request.getParameter("name");
String email=request.getParameter("email");
String address=request.getParameter("address");
String qual=request.getParameter("qual");

String dname="root";
String password="root";
String url="jdbc:mysql://localhost:3306/qualification";

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,dname,password);
PreparedStatement ps=con.prepareStatement("insert into table value(?,?,?,?,?)");

ps.setInt(1, id);
ps.setString(2, name);
ps.setString(3, email);
ps.setString(4, address);
ps.setString(5, qual); 

int i=ps.executeUpdate();
con.close();
ps.close();
if(i!=0)
{
	pw.println("success Register");	
}
else
{
	pw.println("fail Register");
}

%>

