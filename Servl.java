package com.niit.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servl
 */
@WebServlet("/Servl")
public class Servl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet helloworld</title>");
		out.println("<head>");
		out.println("<body bgcolor=\"#808000\">");
		out.println("<h1>Request method</h1>");
		out.println("<h1>Servlet Servl at :"+request.getContextPath()+"</h1>");
		out.println("<h1>Servlet servl requested uri :" +request.getRequestURI());
		out.println("<h1>servlet protocol:"+request.getProtocol()+"</h1>");
		out.println("<b> Server name:</b>"+request.getServerName()+"</br>");
		out.println("<b>server port no:</b>"+request.getServerPort()+ "</br>");
		out.println("<h3>random value at each request : " +Math.random() +"</h3>");
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
