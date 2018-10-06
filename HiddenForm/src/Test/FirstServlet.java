package Test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse responce)
	{
		try 
		{ 
			responce.setContentType("text/html");
			PrintWriter out = responce.getWriter();
			String n =request.getParameter("userName");
			out.print("Welcome"+n);
			out.print("<form action='servlet2' method='post'>");
			out.print("<input type='hidden' name='uname' value='"+n+"'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
