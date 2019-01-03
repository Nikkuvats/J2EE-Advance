package com.aayu.pkg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends GenericServlet {
public void service(ServletRequest req, ServletResponse res) throws ServletException, 

IOException {
ServletContext sc=getServletContext();
ServletConfig sg=getServletConfig();
PrintWriter out=res.getWriter();
out.println(sc.getServerInfo());
out.println(sc.getRealPath("/index.html"));
out.println(sc.getServletContextName());
out.println(sg.getServletName());
out.println(sc.getContextPath());
out.println(sc.getServlets());
out.println(sc.getMimeType(getServletName()));
}
}