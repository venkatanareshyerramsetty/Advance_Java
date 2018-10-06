package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	protected void doPost
	(HttpServletRequest request ,HttpServletResponse responce)
	throws ServletException,IOException
	
	{
		responce.setContentType("text/html");
		PrintWriter out = responce.getWriter();
		request.getRequestDispatcher("link.html").include(request, responce);
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		try
		{
			Connection con=DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from cookiereg where uname=? and pword=?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				out.println("You are Successfully loggied in");
				out.println("<br>Welcome,"+name);
				
				Cookie ck1 =new Cookie("name",name);
				responce.addCookie(ck1);
				Cookie ck2=new Cookie("pass",password);
				responce.addCookie(ck2);
			}
			
			else
			{
				out.print("sorry,username or password error");
				request.getRequestDispatcher("login.html").include(request, responce);
				
				
			}
			
			
		}
		
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }		
		
	 }

	
		
	}
		


