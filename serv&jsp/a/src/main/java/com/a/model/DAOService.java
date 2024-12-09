package com.a.model;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	void saveRegistration(String name, String city, String email, String mobile);
	

}
