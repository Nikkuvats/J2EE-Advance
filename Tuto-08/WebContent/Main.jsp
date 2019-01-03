<%
Cookie fn=new Cookie("fname",request.getParameter("fname"));
Cookie ln=new Cookie("fname",request.getParameter("fname"));

fn.setMaxAge(60*60*24); 
ln.setMaxAge(60*60*24); 

// Add both the cookies in the response header.
response.addCookie( fn );
response.addCookie( ln );
%>
<ul>
<li><b>First Name:</li>
<%= request.getParameter("fname") %>
<li><b>Last Name:</li>
<%= request.getParameter("lname") %>
</ul>
<%
   Cookie cookie = null;
   Cookie[] cookies = null;
   // Get an array of Cookies associated with this domain
   cookies = request.getCookies();
   if( cookies != null ){
      out.println("<h2> Found Cookies Name and Value</h2>");
      for (int i = 0; i < cookies.length; i++){
         cookie = cookies[i];
         out.print("Name : " + cookie.getName( ) + ",  ");
         out.print("Value: " + cookie.getValue( )+" <br/>");
      }
  }else{
      out.println("<h2>No cookies founds</h2>");
  }
%>
<%
   Cookie cookiese = null;
   Cookie[] cookiese = null;
   // Get an array of Cookies associated with this domain
   cookies = request.getCookies();
   if( cookies != null ){
      out.println("<h2> Found Cookies Name and Value</h2>");
      for (int i = 0; i < cookies.length; i++){
         cookie = cookies[i];
         if((cookie.getName( )).compareTo("first_name") == 0 ){
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            out.print("Deleted cookie: " + 
            cookie.getName( ) + "<br/>");
         }
         out.print("Name : " + cookie.getName( ) + ",  ");
         out.print("Value: " + cookie.getValue( )+" <br/>");
      }
  }else{
      out.println(
      "<h2>No cookies founds</h2>");
  }
%>
