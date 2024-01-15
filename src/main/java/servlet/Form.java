package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Form extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		long contact=Long.parseLong(req.getParameter("contact"));
		String email=req.getParameter("email");
		
		try {

			Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root"	);
			
			PreparedStatement pst=conn.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setLong(3, contact);
			pst.setString(4, email);
			int result=pst.executeUpdate();
		
			PrintWriter pw=res.getWriter();
			pw.print(result);
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
