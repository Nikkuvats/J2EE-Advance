<%@page import="java.io.*, java.util.*" %>
<h2> auto Refresed  header Example</h2>

<% response.setIntHeader("Refresh",1);
Calendar cal=new GregorianCalendar();
String am_pm;
int hour=cal.get(cal.HOUR);
int minute=cal.get(cal.MINUTE);
int second=cal.get(cal.SECOND);

if(cal.get(Calendar.AM_PM)==0)
{
	am_pm="AM";
}
else
{
	am_pm="PM";
}
String ct=hour+":"+minute+":"+second+":"+am_pm;
out.println("current time is:"+ct);
%>
  