package com.aayu.pkg;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.util.*;


public class MyServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {

  System.out.println("command: "+request.getParameter("command"));

    response.setContentType("text/html");

    java.io.PrintWriter out = response.getWriter();

    out.println("<html><head>");

    out.println("<title>Help Page</title></head><body>");
    out.println("<h2>Please submit your information</h2>");

    out.println("<form method=\"post\" action =\"" + request.getContextPath() +"/MyServlet\" >");

    out.println("<table border=\"0\"><tr><td valign=\"top\">");
    out.println("Your first name: </td>  <td valign=\"top\">");
    out.println("<input type=\"text\" name=\"firstname\" size=\"20\">");
    out.println("</td></tr><tr><td valign=\"top\">");
  out.println("Your last name: </td>  <td valign=\"top\">");
    out.println("<input type=\"text\" name=\"lastname\" size=\"20\">");
    out.println("</td></tr><tr><td valign=\"top\">");
    out.println("Your email: </td>  <td valign=\"top\">");
    out.println("<input type=\"text\" name=\"email\" size=\"20\">");
    out.println("</td></tr><tr><td valign=\"top\">");

    out.println("<input type=\"submit\" value=\"Submit Info\"></td></tr>");
    out.println("</table></form>");
    out.println("</body></html>");
     }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,java.io.IOException{

  Enumeration paramNames = request.getParameterNames();

  String parName;

  boolean emptyEnum = false;
  if (! paramNames.hasMoreElements())
      emptyEnum = true;


    response.setContentType("text/html");

    java.io.PrintWriter out = response.getWriter();

    out.println("<html><head>");
    out.println("<title>Submitted Parameters</title></head><body>");

  if (emptyEnum){
      out.println("<h2>Sorry, the request does not contain any parameters</h2>");
  } else {
      out.println("<h2>Here are the submitted parameter values</h2>");
  }

  while(paramNames.hasMoreElements()){

      parName = (String) paramNames.nextElement();
      out.println("<strong>" + parName + "</strong> : " + request.getParameter(parName));
      out.println("<br />");
  }

  out.println("</body></html>");

  }
}