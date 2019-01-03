package com.aayu.pkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.Buffer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet() {
        
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	  {
		response.setBufferSize(1180*2);
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    int size=response.getBufferSize();
	    log("The default buffer size is " + size);

	    out.println("The client won't see this");
	    response.reset();
	    out.println("Nor will the client see this!");
	    response.reset();
	    out.println("And this won't be seen if sendError() is called");
	  }
	}
