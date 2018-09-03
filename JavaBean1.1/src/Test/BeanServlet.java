package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;

public class BeanServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		
		
		ArrayList<ProductData> al=new ArrayList<ProductData>();
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		try {
			Connection con =DBconnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from product9");
			
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				ProductData pd = new ProductData();
				pd.setCode(rs.getString(1));
				pd.setName(rs.getString(2));
				pd.setQty(rs.getInt(3));
				al.add(pd);
			}
			req.setAttribute("ref",al);
			RequestDispatcher rd = req.getRequestDispatcher("dis");
			rd.forward(req,res);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	

}
