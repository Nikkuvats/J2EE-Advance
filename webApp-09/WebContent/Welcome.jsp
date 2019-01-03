<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <%@ page import="java.util.*"%>
    
    <%
        Enumeration<String> attr = request.getAttributeNames();
        StringBuilder str = new StringBuilder();
        
        while(attr.hasMoreElements()){
            str.append(attr.nextElement() +"<br />");
        }
     %>
    <body>
        <h1>Attributes are <%= str%>.</h1>
    </body>
</html>