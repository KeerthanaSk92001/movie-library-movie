package Cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//or String email=req.getParameter
		Cookie c1=new Cookie("email", req.getParameter("email"));
		Cookie c2=new Cookie("password",req.getParameter("password"));
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		RequestDispatcher rd=req.getRequestDispatcher("cookies2");
		rd.include(req, resp);
	}
	

}
