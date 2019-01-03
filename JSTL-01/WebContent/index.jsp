<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Process.jsp">
<input type="text" name="fname">
<input type="password" name="pass">
<input type="submit" value="login">
</form>


<h1>ABC.com</h1>  
<hr/>  
<c:import url="http://www.Google.com"></c:import>  

<c:set var="number" value="${200}"></c:set> 
<c:if test="${number<500}">  
<c:out value="number is less than 500"></c:out>  
</c:if>  

</body>
</html>