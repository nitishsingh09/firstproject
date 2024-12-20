package com.a.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.a.model.DAOService;
import com.a.model.DAOServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String email = request.getParameter("email");
	String password= request.getParameter("password");
	
	DAOService service = new DAOServiceImpl();
	
	service.connectDB();
	boolean status = service.verifyCredentials(email,password);
	
	if(status==true) {
		request.setAttribute("msg", "LOGIN SUCEESFULLY");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new-registration.jsp");
		rd.forward(request, response);	
	}else {
		request.setAttribute("msg", "invalid username/password");

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		
	}
	
	}

}
