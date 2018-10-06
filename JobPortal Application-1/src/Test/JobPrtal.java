package Test;
import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

public class JobPrtal extends HttpServlet
{

	public void init() throws ServletException
	{
		
	}
	
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		PrintWriter  pw = res.getWriter();
		res.setContentType("text/html");
		String FIRSTNAME=req.getParameter("firstname");
		String MIDDLENAME=req.getParameter("middlename");
		String LASTNAME=req.getParameter("lastname");
		String FATHERSNAME=req.getParameter("fathername");
		String MOTHERSNAME=req.getParameter("mothername");
		String CURRENTADDRESS=req.getParameter("currentaddress");
		String PERMENENTADDRESS=req.getParameter("permenentaddress");
		String LANDLINE=req.getParameter("landnumber");
		String MOBILENUMBER=req.getParameter("mobilenumber");
		String DATEOFBIRTH=req.getParameter("dateofbirth");
		String PLACEOFBIRTH=req.getParameter("placeofbirth");
		String GENDER=req.getParameter("gender");
		//String GENDER=req.getParameter("female");
		String QUALIFICATION=req.getParameter("highestqualification");
		String YEAROFPASSING=req.getParameter("yearofpassing");
		String LAUNGUAGE=req.getParameter("launguage");
		//String LAUNGUAGE=req.getParameter("Hindi");
		
		String HOBBIES = "";
		if(req.getParameter("Eating") != null) {
			HOBBIES +=  req.getParameter("Eating");
		}
		if(req.getParameter("coding") != null) {
			HOBBIES += "," + req.getParameter("coding");
		}
		if(req.getParameter("sleeping") != null) {
			HOBBIES += "," +  req.getParameter("sleeping");
		}
		
		//String HOBBIES=req.getParameter("coding");
		//String HOBBIES=req.getParameter("sleeping");
		String YOURSELF=req.getParameter("aboutyourself");
		String NATIONALITY=req.getParameter("ddlCountries");
		String ADHARCARD=req.getParameter("adharcardnumber");
		String PANCARD=req.getParameter("pancardnumber");
		String DQUALIFICATION=req.getParameter("qualification");
		String INSTITUTE=req.getParameter("institute");
		String YEAROFDPASS=req.getParameter("year");
		String MARKS=req.getParameter("marks");
		String COMPANYADDRESS=req.getParameter("companyaddress");
		String WORKS=req.getParameter("role");
		String FROMS=req.getParameter("from");
		String TOS=req.getParameter("to");
		String JOBTYPE=req.getParameter("jobtype");
		//String JOBTYPE=req.getParameter("conctract");
		//String JOBTYPE=req.getParameter("other");
		String DATEOFJOINING=req.getParameter("date");
		String TIMEOFJOINING=req.getParameter("time");
		String JOBLOCATION=req.getParameter("joblocation");
		//String JOBLOCATION=req.getParameter("bang");
		//String JOBLOCATION=req.getParameter("other");
		String RELHYDERABAD=req.getParameter("relocate");
		//String RELHYDERABAD=req.getParameter("no");
		String DECLARING=req.getParameter("agree");
		
		try
		{
			Connection con = DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement
			("insert into jobportal values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, FIRSTNAME);
			ps.setString(2, MIDDLENAME);
			ps.setString(3, LASTNAME);
			ps.setString(4, FATHERSNAME);
			ps.setString(5, MOTHERSNAME);
			ps.setString(6, CURRENTADDRESS);
			ps.setString(7, PERMENENTADDRESS);
			ps.setString(8, LANDLINE);
			ps.setString(9, MOBILENUMBER);
			ps.setString(10, DATEOFBIRTH);
			ps.setString(11, PLACEOFBIRTH);
			ps.setString(12, GENDER);
			ps.setString(13, QUALIFICATION);
			ps.setString(14, YEAROFPASSING);
			ps.setString(15, LAUNGUAGE);
			ps.setString(16, HOBBIES);
			ps.setString(17, YOURSELF);
			ps.setString(18, NATIONALITY);
			ps.setString(19, ADHARCARD);
			ps.setString(20, PANCARD);
			ps.setString(21, DQUALIFICATION);
			ps.setString(22, INSTITUTE);
			ps.setString(23, YEAROFDPASS);
			ps.setString(24, MARKS);
			ps.setString(25, COMPANYADDRESS);
			ps.setString(26, WORKS);
			ps.setString(27, FROMS);
			ps.setString(28, TOS);
			ps.setString(29, JOBTYPE);
			ps.setString(30, JOBLOCATION);
			ps.setString(31, TIMEOFJOINING);
			ps.setString(32, JOBLOCATION);
			ps.setString(33, RELHYDERABAD);
			ps.setString(34, DECLARING);
			
			int k=ps.executeUpdate();
			if(k==1)
			{
				pw.println("<br>  Job Registration successfull--All the best");
				
			}
			
					
		}
		
		     catch(Exception e)
		{
		    	 System.out.println(e);
		}
		
		
	}

}
