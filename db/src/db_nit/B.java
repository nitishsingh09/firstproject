package db_nit;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class B {
	
	public static void main(String[] args) {
		
		try { 
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/nit_1","root","bifrost12");
			System.out.println(c);
			
			Statement s = c.createStatement();
//			s.executeUpdate("insert into chaman values('anil','abhay')");
//			s.executeUpdate("insert into chaman value('nitish','gaurav')");
//			s.executeUpdate("insert into chaman values('amit','ankit')");
			
			
			s.executeUpdate("Update chaman set a ='pinky' WHERE b = 'gaurav'");
			s.executeUpdate("Update chaman set b ='radha' WHERE b ='abhay'");
			s.executeUpdate("Update chaman set b = 'urfi' WHERE a = 'amit'");
			
			s.executeUpdate("insert into chaman values('baby','boy')");
//		
			ResultSet res = s.executeQuery("select * from chaman");
			while(res.next()) {
				System.out.println(res.getString(1));
				System.out.println(res.getString(2));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
