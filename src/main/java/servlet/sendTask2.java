package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bye")
public class sendTask2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException {
		resp.getWriter().println("bye");
	}
//  @Override
  
//protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	resp.getWriter().println("bye");
//}
  

}
