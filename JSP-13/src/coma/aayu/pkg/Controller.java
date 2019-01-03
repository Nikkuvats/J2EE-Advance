package coma.aayu.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.StyledEditorKit.BoldAction;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
       
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	System.out.println("aayush");
    	response.setContentType("text/html");
    	PrintWriter pw=response.getWriter();
    	
    	String name=request.getParameter("name");
    	String pass=request.getParameter("pass");
    	
    	pw.println("hiii");
    	
    	Bean obj=new Bean();
    	obj.setName(name);
    	obj.setPass(pass);
    	request.setAttribute("obj",obj);
    	
    	boolean status=obj.validate();
    	if(status)
    	{
    		RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
    		rd.forward(request, response);
    	}
    	else
    	{
    		RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
    		rd.forward(request, response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request,response);
	}
}
