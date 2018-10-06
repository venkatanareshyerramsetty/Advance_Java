package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
public class DisServlet  extends HttpServlet {

	public void doPost (HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	ServletContext sct =req.getServletContext();
	RegBean rb = (RegBean)sct.getAttribute("beanRef");
	String sub=req.getParameter("preview");
	if(sub.equals("PreView"))
	{
		pw.println("UserName:"+rb.getUserName()+"<br>");
		pw.println("PassWord:"+rb.getPassWord()+"<br>");
		pw.println("Firstname:"+rb.getFirstName()+"<br>");
		pw.println("LastName:"+rb.getLastName()+"<br>");
		pw.println("Address:"+rb.getAddress()+"<br>");
		pw.println("phoneNo:"+rb.getphoneNo()+"<br>");
		pw.println("mailId:"+rb.getmailId()+"<br>");
		
		RequestDispatcher rd=req.getRequestDispatcher("final.html");
		rd.include(req,res);
		
	} 
	else
	{
		try {
			Connection con =DBconnection.getCon();
			PreparedStatement ps =con.prepareStatement("insert into cookiereg values(?,?,?,?,?,?,?)");
			ps.setString(1, rb.getUserName());
			ps.setString(2, rb.getPassWord());
			ps.setString(3, rb.getFirstName());
			ps.setString(4, rb.getLastName());
			ps.setString(5, rb.getAddress());
			ps.setString(6, rb.getphoneNo());
			ps.setString(7, rb.getmailId());
			int k=ps.executeUpdate();
			
			if(k==1)
			{
				pw.println("User Registered Succussfully");
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				rd.include(req, res);
			}
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
	
	

}
