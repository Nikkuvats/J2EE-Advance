package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		hs.setAttribute("name", name);
		hs.setAttribute("password", password);
		out.println("ligin success");
		
		out.println("<a href='.logout'>Logout</a>");
		
	}
}
