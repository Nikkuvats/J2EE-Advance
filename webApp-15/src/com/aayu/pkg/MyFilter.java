package com.aayu.pkg;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.*;  
  
public class MyFilter implements Filter{  
FilterConfig config;  
  
public void init(FilterConfig config) throws ServletException {  
    this.config=config;  
}  
  
public void doFilter(ServletRequest req, ServletResponse resp,  
    FilterChain chain) throws IOException, ServletException {  
      
    PrintWriter out=resp.getWriter();  
    System.out.println("filter is invoked befor");      

    chain.doFilter(req, resp);//sends request to next resource  
    System.out.println("filter is invoked after");
}  
      
public void destroy() {}  
}  