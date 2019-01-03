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
String s1=request.getParameter("num1");
String s2=request.getParameter("num2");

int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=a/b;
out.println("division of numbers="+c);
%>
<%@ page errorPage="error.jsp" %>
</body>
</html>