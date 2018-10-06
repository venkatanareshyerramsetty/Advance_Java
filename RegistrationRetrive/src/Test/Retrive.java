package Test;

import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class Retrive extends GenericServlet {
	public void init()throws ServletException
	{}


	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		PrintWriter  pw = res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("username");
		String pWord=req.getParameter("password");
		try
		{
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from registration9 where uName=? and pWord=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				pw.println("<br>uName:"+rs.getString(1));
				pw.println("<br>pWord:"+rs.getString(2));
				pw.println("<br>fName:"+rs.getString(3));
				pw.println("<br>lName:"+rs.getString(4));
				pw.println("<br>Address:"+rs.getString(5));
				pw.println("<br>pHno:"+rs.getString(6));
				pw.println("<br>mailId:"+rs.getString(7));
				
				
			}
			else {
				pw.println("<br>Invalid username or password");
			     }
			
					
		}
		
		     catch(Exception e)
		{
		    	 System.out.println(e);
		}
		
		
	}
	
	     public void distroy()
	     {}
}
	
	


