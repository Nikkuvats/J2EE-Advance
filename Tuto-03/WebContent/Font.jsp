<%! int i; %>

<% for(int i=1; i<=7 ; i++)
{  %>
<font color="green" size="<%= i %>">
Hello Aayush
</font><br>
<% }  %>


<h2>The include action Example</h2>
<jsp:include page="Welcome.jsp" flush="true" />