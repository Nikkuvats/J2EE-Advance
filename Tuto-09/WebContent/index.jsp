<%@ page import="java.io.*,java.util.*" %>
<% 
Date createTime=new Date(session.getCreationTime());
Date lastAcessTime=new Date(session.getLastAccessedTime());

String title="welcome back to my site";
Integer visitcount=new Integer(0);
String visitcountkey=new String("visit");
String userIDKey=new String("userId");
String userID=new String("ABCD");

if(session.isNew())
{
	title="welcome to my site";
	session.setAttribute(userIDKey,userID);
	session.setAttribute(visitcountkey, visitcount);
	 visitcount = (Integer)session.getAttribute(visitcountkey);
	   visitcount = visitcount + 1;
	   userID = (String)session.getAttribute(userIDKey);
	   session.setAttribute(visitcountkey,  visitcount);
}
%>

<html>
<head>
<title>Session Tracking</title>
</head>
<body>
<center>
<h1>Session Tracking</h1>
</center>
<table border="1" align="center"> 
<tr bgcolor="#949494">
   <th>Session info</th>
   <th>Value</th>
</tr> 
<tr>
   <td>id</td>
   <td><% out.print( session.getId()); %></td>
</tr> 
<tr>
   <td>Creation Time</td>
   <td><% out.print(createTime); %></td>
</tr> 
<tr>
   <td>Time of Last Access</td>
   <td><% out.print(lastAcessTime); %></td>
</tr> 
<tr>
   <td>User ID</td>
   <td><% out.print(userID); %></td>
</tr> 
<tr>
   <td>Number of visits</td>
   <td><% out.print(visitcount); %></td>
</tr> 
</table> 
</body>
</html>