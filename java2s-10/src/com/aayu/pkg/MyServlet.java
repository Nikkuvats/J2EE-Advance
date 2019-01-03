package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
      IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String sessionid = null;
    Cookie[] cookies = req.getCookies();
    if (cookies != null) {
      for (int i = 0; i < cookies.length; i++) {
        if (cookies[i].getName().equals("sessionid")) {
          sessionid = cookies[i].getValue();
          break;
        }
      }
    }

    // If the session ID wasn't sent, generate one.
    // Then be sure to send it to the client with the response.
    if (sessionid == null) {
      sessionid = generateSessionId();
      Cookie c = new Cookie("sessionid", sessionid);
      res.addCookie(c);
    }

    out.println("<HEAD><TITLE>Current Shopping Cart Items</TITLE></HEAD>");
    out.println("<BODY>");

    // Cart items are associated with the session ID
    String[] items = getItemsFromCart(sessionid);

    // Print the current cart items.
    out.println("You currently have the following items in your cart:<BR>");
    if (items == null) {
      out.println("<B>None</B>");
    } else {
      out.println("<UL>");
      for (int i = 0; i < items.length; i++) {
        out.println("<LI>" + items[i]);
      }
      out.println("</UL>");
    }

    // Ask if they want to add more items or check out.
    out.println("<FORM ACTION=\"/servlet/ShoppingCart\" METHOD=POST>");
    out.println("Would you like to<BR>");
    out.println("<INPUT TYPE=SUBMIT VALUE=\" Add More Items \">");
    out.println("<INPUT TYPE=SUBMIT VALUE=\" Check Out \">");
    out.println("</FORM>");

    // Offer a help page.
    out.println("For help, click <A HREF=\"/servlet/Help"
        + "?topic=ShoppingCartViewerCookie\">here</A>");

    out.println("</BODY></HTML>");
  }

  private static String generateSessionId() throws UnsupportedEncodingException {
    String uid = new java.rmi.server.UID().toString(); // guaranteed unique
    return URLEncoder.encode(uid,"UTF-8"); // encode any special chars
  }

  private static String[] getItemsFromCart(String sessionid) {
    return new String[]{"a","b"};  
  }
}