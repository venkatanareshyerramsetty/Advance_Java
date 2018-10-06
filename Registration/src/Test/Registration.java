package Test;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Registration extends GenericServlet {
	public void init() throws ServletException
	           {}	
	public void service(ServletRequest req, ServletResponse res)
	throws ServletException, IOException {
	
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("username");
		String pWord=req.getParameter("password");
		String fName=req.getParameter("firstname");
		String lName=req.getParameter("lastname");
		String Address=req.getParameter("address");
		String pHno=req.getParameter("phoneno");
		String mailId=req.getParameter("mailid");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:orcl2","scott","tiger");
			PreparedStatement ps=con.prepareStatement("insert into registration9 values(?,?,?,?,?,?,?)");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ps.setString(3, fName);
			ps.setString(4, lName);
			ps.setString(5, Address);
			ps.setString(6, pHno);
			ps.setString(7, mailId);
			
			int k=ps.executeUpdate();
			
			if(k==1)
			{
				pw.println("Record is updated");
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
	


