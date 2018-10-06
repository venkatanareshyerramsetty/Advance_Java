package Test;
import java.io.*;

import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class GetProductsServlet extends HttpServlet {
          public void init()throws ServletException 
          {
        	    productsdao = new ProductsDAO();
        	  
          }

		
		public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
			HttpSession hs = req.getSession();
			if(hs==null)
			{
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.forward(req,res);
				return;
			}
			
			String uname=(String)hs.getAttribute("UserName");
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<html><head>");
			out.println("<title>Shopping Cart</title>");
			out.println("</head><body>");
			out.println("table width='100%'height='90%'border='1'");
			out.println("<tr align='center'>");
			out.println("<td height='39'colspan='2'><strong><font size='5'>MyShopping Cart</font></strong></td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td width='18%' height='500'valign='top'><p>&nbsp;</p>");
			out.println("<blockquote><p>");
			out.println("<p><a href='"+res.encodeURL("getProducts")+"'>");
			out.println("View Products</a></p><p>");
			out.println("<p><a href='"+res.encodeURL("getCart")+"'>");
			out.println("View Cart Details</a></p>");
			out.println("<p><a href='"+res.encodeURL("logout")+"'>");
			out.println("Logout</a></p>");
			out.println("</blockquote></td>");
			out.println("<td width='82%'align='left' valign='top'><p>");
			out.println("<font size='6'>Welcome,"+uname+"</font><p>");
			out.println("form method='post' action='"+res.encodeURL("addProducts")+"'>");
			out.println("<table width='100%' border='1'>");
			out.println("<tr>");
			out.println("<th width='8%'>chech</th>");
			out.println("<th width='24%'>product Code</th>");
			out.println("<th width='28%'>product Name</th>");
			out.println("<th width='20%'>Available Quantity</th>");
			out.println("<th width='20%'>Reqired Quantity</th>");
			out.println("</tr>");
			
			Collection products = productsdao.getProducts();
			if(products==null)
			{
				out.println("<tr><td colspan='3' align='center'>");
	        	out.println("No Products Availible ");
	        	out.println("</td></tr>");
	        }
	        else
	        {
	        	Iterator i=products.iterator();
	        	while(i.hasNext())
	        	{
	        		Product p=(Product)i.next();
	        		out.println("<tr>");
	        		out.println("<td align='center'>");
	        		out.println("<input type='checkbox' name='products' value='"+p.getCode()+"'/>");
	        		out.println("<input type='hidden' name='"+p.getCode()+"Name'Value='"+p.getName()+"'/></td>");
	        		out.println("<td>"+p.getCode()+"</td>");
	        		out.println("<td>"+p.getName()+"</td>");
	        		out.println("<td>"+p.getQty()+"</td>");
	        		out.println("<td>");
	        		out.println("<input type='text' name='"+p.getCode()+"'/>");
	        		out.println("</td></tr>");
	        		
			}
	    }
			
			    out.println("</table>");
			    out.println("<br/><center>");
			    out.println("<input type='submit'value='Add Products to Cart'/>");
			    out.println("</center>");
			    out.println("</form>");
			    out.println("</td></tr>");
			    out.println("<tr align='center'>");
			    out.println("<td colspan='2'>");
			    out.println("<em>&copy:Copyight2016-2017</em></td>");
			    out.println("</tr>");
			    out.println("</tables>");
			    out.println("</body></html>");
			    out.flush();
			    out.close();
			    
		}
		ProductsDAO productsdao;
          
          
   }
		
