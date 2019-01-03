<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello world<br/>
<%
out.println("your local address:"+request.getLocalAddr());
out.println("\n your remote address:"+request.getRemoteAddr());
out.println("\n your authotype:"+request.getAuthType());
out.println("\n your contentlength:"+request.getContentLength());
out.println("\n your contextpath:"+request.getContextPath());
out.println("\n your getcontenttype:"+request.getContentType());
out.println("\n your localname:"+request.getLocalName());
out.println("\n your localport:"+request.getLocalPort());
out.println("\n your protocol:"+request.getProtocol());
out.println("\n your remoteport:"+request.getRemotePort());
out.println("\n your servername:"+request.getServerName());
out.println("\n your servletpath:"+request.getServletPath());
out.println("\n your serverport:"+request.getServerPort());
out.println("\n your method:"+request.getMethod());
%>
</body>
</html>