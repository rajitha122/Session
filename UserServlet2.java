package com.niit.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UserServlet2
 */
@WebServlet("/UserServlet2")
public class UserServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext context=getServletContext();
		Object obj=context.getAttribute("userid");
		PrintWriter out=response.getWriter();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","rajitha");  
		Statement s=con.createStatement();  
		ResultSet rs=s.executeQuery("Select * from candidates where id ='" +obj.toString()+"'");  
		boolean flag = rs.next();
		if(flag == true)
		{
			String first_name = rs.getString(2);
			String last_name = rs.getString(3);
			String phone = rs.getString(5);
			String email = rs.getString(6);
			out.println("First Name : "+first_name);
			out.println("Last Name :"+last_name);
			out.println("Phone Number :" +phone);
			out.println("email :" +email);
		}
		else {
				
				out.println("<font color = red size = 7 > login Failed</font>");
				con.close();
		}
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		


}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
