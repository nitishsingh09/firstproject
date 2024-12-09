package com.a.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	
	private Connection con;
	private Statement stm;

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/student_data_db","root","bifrost12");
			stm=con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			ResultSet result = stm.executeQuery("select * from login where email ='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void saveRegistration(String name, String city, String email, String mobile) {
		try {
			stm.executeQuery("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	
}
