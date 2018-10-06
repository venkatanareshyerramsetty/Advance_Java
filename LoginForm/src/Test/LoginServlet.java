package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class LoginServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res)
	throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("username");
		String pWord=req.getParameter("password");
		
		try 
		{
		  Connection con = DBconnection.getCon();
		  PreparedStatement ps = con.prepareStatement
		  ("select * from registration9 where uname=? and pword=?");
		  ps.setString(1, uName);
		  ps.setString(2, pWord);
		  ResultSet rs=ps.executeQuery();
		  if(rs.next())
		  {
			  RequestDispatcher rd=req.getRequestDispatcher("dis");
			  rd.forward(req, res);
			  
		  }
		  else
		  {
			  pw.println("<br>invalid username or password");
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
