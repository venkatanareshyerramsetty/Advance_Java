package Test;
import java.io.*;
import javax.servlet.*;
public class RegServlet2 extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) 
	throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		ServletContext sct = req.getServletContext();
		RegData rd = (RegData) sct.getAttribute("bRef");
		String addr = req.getParameter("address");
		long pNo = Long.parseLong(req.getParameter("phoneno"));
		String mId = req.getParameter("mailid");
		rd.setAddress(addr);
		rd.setPhoneNo(pNo);
		rd.setMailId(mId);
		req.setAttribute("uRef",rd);
		RequestDispatcher rd1 =req.getRequestDispatcher("reg3");
		rd1.forward(req, res);
	
	}

}
