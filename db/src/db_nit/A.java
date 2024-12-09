package db_nit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class A {
		public static void main(String[] args) {
			try {
				//connect with database
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nit", "root", "bifrost12");
				System.out.println(con);
				// insert records into database table
				Statement st = con.createStatement();
				st.executeUpdate("Update registration set city='bangalore' where city='up' ");
				
				
				// read value from database
				
//				ResultSet result = st.executeQuery("select * from registration");
//				while(result.next()) {
//					System.out.println(result.getString(1));
//					System.out.println(result.getString(2));
//				}
				
				//delete value from database
//				st.executeUpdate("DELETE FROM registration WHERE name ='anil'");
//				st.executeUpdate("DELETE FROM registration WHERE city='ghaziabad'");
				st.executeUpdate("DELETE FROM registration WHERE email='100'");
				con.close();
				
				//disconnect
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
