package Test;

import java.io.*;
import javax.servlet.*;

public class DisServlet extends GenericServlet 
{
	public void init()
	throws ServletException 
	{
		
	}
	
	public void service(ServletRequest req,ServletResponse res)
	
	throws ServletException,IOException
	{
			
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	pw.print("<h1>Welcome to servlet programming</h1>");
	}
	
	public void destroy()
	{
		
	}
	

}
