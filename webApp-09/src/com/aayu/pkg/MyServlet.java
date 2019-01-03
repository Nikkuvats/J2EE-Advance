package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class MyServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        PrintWriter out = res.getWriter();

        String userName = req.getParameter("mailID");
        String password = req.getParameter("passwd");
        String conPassword = req.getParameter("confPasswd");
        String myCountry = req.getParameter("country");
        
        String welcome = "Welcome " + userName;
        String country = "You are from " + myCountry;
        
        req.setAttribute("welcome", welcome);
        req.setAttribute("country", country);
        
        RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
        rd.forward(req, res);
    }
}