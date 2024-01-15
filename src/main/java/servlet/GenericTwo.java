 package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericTwo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Servlet-config
		
//		ServletConfig config=getServletConfig();
//		String db=getInitParameter("dbname");
//		
//		PrintWriter pw=res.getWriter();
//		pw.print(db);
		
		//Servlet-context
		
		ServletContext context=getServletContext();
		String name=context.getInitParameter("ename");
		PrintWriter pw=res.getWriter();
		pw.print(name);
		
	}

}
