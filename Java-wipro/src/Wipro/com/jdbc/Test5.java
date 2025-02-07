package Wipro.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test5 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro_training?useSSL=false", "root","25sep19nov");
 
		connection.setAutoCommit(false);
		Statement statement = connection.createStatement();
		int x = statement.executeUpdate("update Anmol set balance=balance-15000 where accountNo=2001");
 
		int y = statement.executeUpdate("update Mansi set balance=balance+750000 where accountNo=1002");
 
		if (x > 0 && y > 0) {
			connection.commit();
			System.out.println("funds transferred successfully");
			
		} else {
			connection.rollback();
			System.out.println("kindly check account no's, have a good day");
			
		}
 
 
		connection.close();
 
	}
}
