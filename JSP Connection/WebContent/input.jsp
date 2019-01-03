<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>

<% 
String name="root";
String password="root";
String url="jdbc:mysql://localhost:3306/qualification";

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url, name, password);
PreparedStatement ps=con.prepareStatement("select * from course");
ResultSet rs=ps.executeQuery();
%>

<form action="./reg.jsp">
<pre>
ID:     <input type="number" name="id">
Name:   <input type="text" name="name"/>
Email:  <input type="text" name="email"/>
Address:<input type="text" name="address"/>
Qual:   <select name="qual"/>

		<% 
		while(rs.next()){
		%>
		<option value="<%=rs.getString(2)%>"><%=rs.getString(2)%></option>
		<%
		}
		%>
</select>

<input type="submit">
</pre>
</form>
<%
rs.close();
con.close();
%>
