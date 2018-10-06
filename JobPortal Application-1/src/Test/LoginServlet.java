package Test;

import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class LoginServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res)
	throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("User Name");
		String pWord=req.getParameter("Password");
		
		try 
		{
		  Connection con = DBconnection.getCon();
		  PreparedStatement ps = con.prepareStatement
		  ("select * from regtrain9 where uName=? and pWord=?");
		  ps.setString(1, uName);
		  ps.setString(2, pWord);
		  ResultSet rs=ps.executeQuery();
		  if(rs.next())
		  {
			  pw.println("<br> loginn successufull");
			  pw.println("<br> Welcome:"+uName);
			  RequestDispatcher ri=req.getRequestDispatcher("index.html");
			  ri.include(req, res);
		  }
		  else
		  {
			  pw.println("invalid username or password");
			  RequestDispatcher rd=req.getRequestDispatcher("login.html");
			  rd.include(req, res);
		  }
		  
		}
		 catch(Exception e)
		{
			 System.out.println(e);
		}
		
	}
	

}
