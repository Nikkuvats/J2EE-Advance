<body>
This is login page<br>
<%String user = (String)request.getAttribute("user"); %>
<h1>Hello <%=user%></h1>
${al}<br>
Hello - ${name} <br>
Password - ${pass}<br>
<form action="Log" method="Post">
	<input type="text" name="name"/><br>
	<input type="password" name="pass">
	<input type="submit" value="Submit"> 
</form>
</body>