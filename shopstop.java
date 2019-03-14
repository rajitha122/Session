package com.niit.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class shopstop
 */
@WebServlet("/shopstop")
public class shopstop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shopstop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		String comments=request.getParameter("txtcomment");
		String items=request.getParameter("rbitems");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>shop stop</title></head>");
		out.println("<body bgcolor=\"#808000\">");
		out.println("congratulation,you are qualified for our lucky draw");
		out.println("<br/>");
		out.println("your comments :"+comments);
		out.println("<br/>");
		out.println("number of items purchased :"+items);
		out.println("<br/>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
