<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("second p aa gaya");
String name=(String)pageContext.getAttribute("user",pageContext.SESSION_SCOPE);  
out.print("Hello "+name); 
%>
<%@ page import="java.util.Date"%>
Today is:<%=new Date()%>
<%@ include file="index.html" %>
Today is:<%=new Date()%>



</body>
</html>