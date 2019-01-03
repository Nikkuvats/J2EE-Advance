<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "welcome to Aayush" %>  
Current time:<%= Calendar.getInstance().getTime() %><br>

<%! int data=50; %>
<%="value of the variable is:"+data %><br>
<%!int cube(int n){
return n*n*n;
}%><br>
<%=cube(3)%><br>
<%="today is:"+Calendar.getInstance().getTime()%>
</body>
</html>