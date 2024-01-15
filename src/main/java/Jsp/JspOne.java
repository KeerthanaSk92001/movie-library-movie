package Jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/jspone")
public class JspOne extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("mail");
		String pass=req.getParameter("password");
		
		if(email.isEmpty() || pass.isEmpty())
		{
			req.setAttribute("message", "email or password is missing");
			RequestDispatcher rdispatcher=req.getRequestDispatcher("login.jsp");
			rdispatcher.include(req, resp);
		}
		else
		{
			RequestDispatcher rdispatcher=req.getRequestDispatcher("home.jsp");
			rdispatcher.include(req, resp);
		}
	}

}