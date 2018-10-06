package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalServlet extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String pCode=req.getParameter("pcode");
		String pName=req.getParameter("pname");
		float pPrice=Float.parseFloat(req.getParameter("pprice"));
		int pQty=Integer.parseInt(req.getParameter("pqty"));
		float billAmt=pPrice*pQty;
		float fAmt=billAmt;
		if(billAmt>5000)
		{
			res.sendRedirect("http://localhost:8083/WebApp2/dis?bAmt="+billAmt+"&fAmt="+fAmt+"&pcode"+pCode+"pname="+pName);
			
		}
		
		else {
			    pw.println("Final bill amount");
			    pw.println("<br>ProductCode"+pCode);
			    pw.println("<br>BillAmount"+billAmt);
			    pw.println("<br>FinalBill"+fAmt);
		}
		
	}
}
