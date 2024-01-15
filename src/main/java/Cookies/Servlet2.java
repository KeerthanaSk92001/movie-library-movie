package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookies2")
public class Servlet2 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[]arr=req.getCookies();
		String email=null;
		String password=null;
		
		if(arr.length>0)
		{
			for(Cookie c:arr)
			{
				if(c.getValue().equals("demo@gmail.com"))
				{
					email=c.getValue();
					
					
				}
				
				if(c.getValue().equals("1234"))
				{
					password=c.getValue();
					
					
				}
			}
			if(email!=null && password!=null)
			{
				PrintWriter pw=resp.getWriter();
				pw.print("Hello");
			}
			else
			{
				PrintWriter pw=resp.getWriter();
				pw.print("Login required");
			}
		}
	}
}
