package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert1")
public class Task2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		int id=(int)req.getAttribute("id");
		String name=(String)req.getAttribute("name");
		String email=(String)req.getAttribute("email");
		Long contact=(Long) req.getAttribute("contact");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace1\\basicmavenproject\\src\\main\\java\\servlet\\abc.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String url=p.getProperty("url");
			
			
			try {
				Connection con = DriverManager.getConnection(url,p);
				

				CallableStatement cst=con.prepareCall("call db3.task1(?,?,?,?)");
				cst.setInt(1, id);
				cst.setString(2, name);
				cst.setString(3, email);
				cst.setLong(4, contact);
				
				int result=cst.executeUpdate();
				PrintWriter pw=resp.getWriter();
				pw.print(result+" row inserted");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
