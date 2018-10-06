package Test;
import java.io.*;

import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserHomeServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		
		HttpSession hs =req.getSession(false);
		if(hs==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, res);
			return;
		}
		String uname=(String)hs.getAttribute("UserName");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head>");
		out.println("<title>Shopping cart Example</title>");
		out.println("</head><body>");
		out.print("<table width='100%' height='90%'border='1'>");
		out.println("<tr align='center'>");
		out.println("<td height='39' colspan='2'>");
		out.println("<strong><font size='5'MyShopping site</font>");
		out.println("</strong>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td width='18%' height='500'valign='top'>");
		out.println("<p>&nbsp;</p>");
		out.println("<blockquote><p>");
		out.println("<a href='"+res.encodeURL("getProducts")+"'>");
		out.println("View products</a></p>");
		out.println("<a href='"+res.encodeURL("getCart")+"'>");
		out.println("View Cart Details</a></p>");
		out.println("<a href='"+res.encodeURL("logout")+"'>");
		out.println("Logout</a></p>");
		out.println("</blockquote></td>");
		out.println("<td width='82%' align='left'valign='top'>");
		out.println("<font size='6'>Welcome,"+uname+"</font></td>");
		out.println("</tr>");
		out.println("<tr align='center'>");
		out.println("<td cospan='2'>");
		out.println("<em>&copy;Copy rights 2016-18</em></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body></html>");
		out.flush();
		out.close();
		
	}
		
	

}
