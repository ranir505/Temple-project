package com.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.temple.login.LoginService;


/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("username", user);
		session.setAttribute("password", pass);
		
		boolean status = LoginService.authenticateUser(user, pass);
		RequestDispatcher rd = null;
		if(status)
		{
			rd = request.getRequestDispatcher("dashboard.jsp");
		}
		else
		{
			request.setAttribute("status", "login failed. Try again.!");
			rd = request.getRequestDispatcher("index.jsp");
		}
		rd.forward(request, response);
		response.setContentType("text/html");
	}

}
