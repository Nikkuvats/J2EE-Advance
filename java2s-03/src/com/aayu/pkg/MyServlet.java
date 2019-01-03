package com.aayu.pkg;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    HttpSession hs = request.getSession(false);

    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    pw.print("<B>");

    Date date = (Date) hs.getAttribute("date");
    if (date != null) {
      pw.print("Last access: " + date + "<br>");
    }

    date = new Date();
    hs.setAttribute("date", date);
    pw.println("Current date: " + date);
  }
}