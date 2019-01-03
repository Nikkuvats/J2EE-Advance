<%@page import="java.io.*,java.util.*" %>

<%
Integer hitscount=(Integer)application.getAttribute("hitcounter");

if(hitscount==null||hitscount==0)
{
	out.println("welcome to my website");
	hitscount=1;
}
else
{
	out.println("welcome back to my website");
	hitscount+=1;
}
application.setAttribute("hitCounter", hitscount);

%>
<center>
<p>total number of visit:<%= hitscount %></p>
</center>