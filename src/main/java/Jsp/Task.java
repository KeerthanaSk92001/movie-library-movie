package Jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class Task extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int a=Integer.parseInt(req.getParameter("a"));
		int b=Integer.parseInt(req.getParameter("b"));
//		int add=a+b;
//		int sub=a-b;
//		int mul=a*b;
//		int div=a/b;
		req.setAttribute("a", a);
		req.setAttribute("b", b);
		
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("calculator.jsp");
		dispatcher.include(req, resp);
		
		//System.out.println(add);
		
		

		
		
		
	}

}
