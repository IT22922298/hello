package Oopdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LOGIN")
public class LOGIN extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		try {
			String qry= "SELECT * FROM login WHERE userName = '"+userName+"'AND password = '"+password+"'";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vithuz","admin","root");
			PreparedStatement p1 = con.prepareStatement(qry);
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery(qry);
			
			PrintWriter w1 = response.getWriter();
			if(rs.next())
			{
				w1.print("LOGIN SUCESSFULL");
			}
			else
			{
				w1.print("LOGIN FAILED !!!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
