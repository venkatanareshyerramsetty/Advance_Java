package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs!=null)
		{
			hs.invalidate();
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, res);
		}
	}
	

}
