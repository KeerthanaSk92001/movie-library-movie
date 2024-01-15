package HttpPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet ("/session")
public class SessionOne extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session=req.getSession();
		session.setAttribute("email",req.getParameter("email"));
		session.setAttribute("password",req.getParameter("password"));
		
//		req.setAttribute("demo", "demo_data"); not required
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/SessionTwo");
		dispatcher.include(req, resp);
		
		
		
		
	}

}
