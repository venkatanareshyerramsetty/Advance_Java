package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class FinalServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res)
	throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		RegData rd = (RegData)req.getAttribute("uRef");
		
		try {
		Connection con =DBconnection.getCon();
		PreparedStatement ps = con.prepareStatement("insert into registration9 values(?,?,?,?,?,?,?)");
		ps.setString(1, rd.getNmae());
		ps.setString(2, rd.getWord());
		ps.setString(3, rd.getFirstName());
		ps.setString(4, rd.getLastName());
		ps.setString(5, rd.getAddress());
		ps.setLong(6, rd.getPhoneNo());
		ps.setString(7, rd.getMailId());
		
		int k=ps.executeUpdate();
		   if(k==1)
		   {
			   pw.println("user is regestered successfully");
		   }
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
