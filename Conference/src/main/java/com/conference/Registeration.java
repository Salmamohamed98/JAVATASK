package com.conference;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Registeration
 */
public class Registeration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registeration() {
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
	 * @see HttpServlet#doPost(HttpServletRequest req , HttpServletResponse res)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// get the user 
		// check validation 
		// insert new user to the data base 
		User atendee= new User(req.getParameter("name"),req.getParameter("email"), req.getParameter("password"));
		Boolean inserted =UserManager.registerNewUser(atendee);
		if (inserted) {
		res.getWriter().append("Welcome"+atendee.getName());
		}else {
			res.getWriter().append(" please try again");
		}
		

	}

}
