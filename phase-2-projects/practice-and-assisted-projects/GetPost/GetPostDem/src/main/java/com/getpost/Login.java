package com.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<tittle>Dynamic HTML</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>The details entered by the user are </h2>");
		out.println("<h3>Username: " + uname + "</h3>");
		out.println("<h3>Password: " + pwd + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname1 = request.getParameter("uname1");
		String pwd1 = request.getParameter("pwd1");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<tittle>Dynamic HTML</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>The details entered by the user are </h2>");
		out.println("<h3>Username: " + uname1 + "</h3>");
		out.println("<h3>Password: " + pwd1 + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

}
