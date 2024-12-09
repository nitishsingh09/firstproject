package com.a.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.a.model.DAOService;
import com.a.model.DAOServiceImpl;

@WebServlet("/new")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NewRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name = request.getParameter("name");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	
	DAOService service = new DAOServiceImpl();
	service.connectDB();
	service.saveRegistration(name,city,email,mobile);
	
	request.setAttribute("message", "DATA IS SAVED IN DATABASE");
	RequestDispatcher  rd = request.getRequestDispatcher("WEB-INF/views/new-registration.jsp");
	rd.forward(request, response);
	
	
	}

}
