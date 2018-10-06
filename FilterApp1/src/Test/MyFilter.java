package Test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		
		String uName=req.getParameter("username");
		String pWord=req.getParameter("password");
		
		try
		{
			Connection con=DBconnection.getCon();
			PreparedStatement ps= con.prepareStatement("select * from registration9 where uname=?,pword=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				chain.doFilter(req, res);
				
			}
			else
			{
				pw.println("<br>Invalid username or password");
				RequestDispatcher rd= req.getRequestDispatcher("login.html");
				rd.include(req, res);
			}
		}
		 catch(Exception e)
		{
			 System.out.println(e);
		}
		
	}
	
	

}
