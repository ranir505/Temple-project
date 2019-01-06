package com.temple.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUserController
 */
//@WebServlet("/AddUserController")
public class AddUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		int status = AddUser.addUser(user, pass);
		
		if(status == 1)
		{
			request.setAttribute("status", "user added successfully.!");
			RequestDispatcher rd = request.getRequestDispatcher("usersList.jsp");
			rd.forward(request, response);
		}
	}

}

