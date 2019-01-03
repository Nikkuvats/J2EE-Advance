package com.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySetServlet
 */
public class MySetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = res.getWriter();

        String userName = req.getParameter("mailID");
        String password = req.getParameter("passwd");
        String conPassword = req.getParameter("confPasswd");
        String myCountry = req.getParameter("country");
        
        String welcome = " Aayush" +" '"+userName+"'";
        String country = "You are from "+ "'"+myCountry+"'";
        String username="name"+ "'"+userName+"'";
        String pass="name";
        
        req.setAttribute("aaysuh", welcome);
        req.setAttribute("india", country);
        req.setAttribute("anant", username);
        req.setAttribute("ye zindgi", pass);
        
        RequestDispatcher rd = req.getRequestDispatcher("/MyGetServlet");
        rd.forward(req, res);
	}

}
