package Test;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	protected void doGet
	(HttpServletRequest request,HttpServletResponse responce)
	throws ServletException,IOException
	{
		responce.setContentType("text/html");
		PrintWriter out=responce.getWriter();
		request.getRequestDispatcher("link.html").include(request, responce);
		Cookie ck[]=request.getCookies();
		if(ck!=null)
		{
			String name=ck[0].getValue();
			String pass=ck[1].getValue();
			if(!name.equals("")||name!=null)
			{
				out.println("<br>Welcome, "+name);
				try {
					Connection con =DBconnection.getCon();
					PreparedStatement ps =con.prepareStatement("select * from cookiereg");
					ResultSet rs =ps.executeQuery();
					if(rs.next())
					{
						out.println("<br>FirstName:"+rs.getString(3)+"<br>");
						out.println("<br>LastName:"+rs.getString(4)+"<br>");
						out.println("<br>Address:"+rs.getString(5)+"<br>");
						out.println("<br>PhoneNo:"+rs.getString(6)+"<br>");
						out.println("<br>mailId:"+rs.getString(7)+"<br>");
						
					}
					
				}
				
				catch(Exception e)
				{
					System.out.println(e);
				}
							
			}
		}
			
			else
			{
				out.println("Please login first");
				request.getRequestDispatcher("login.html").include(request,responce);
			}
			out.close();
		}
		
	}


