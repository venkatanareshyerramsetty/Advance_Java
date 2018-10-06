package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisServlet extends HttpServlet{

	
	public void service(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	String pCode=req.getParameter("pcode");
	String pName=req.getParameter("pname");
	float billAmt=Float.parseFloat(req.getParameter("bAmt"));
	float fAmt=Float.parseFloat(req.getParameter("fAmt"));
	fAmt=billAmt-(0.15F*billAmt);
	
	pw.println("<br>Final bill Aftr Discount");
	pw.println("<br>ProductCode"+pCode);
	pw.println("<br>ProductName"+pName);
	pw.println("<br>BillAmount"+billAmt);
	pw.println("<br>FinalAmount"+fAmt);
		
	}
	
}
