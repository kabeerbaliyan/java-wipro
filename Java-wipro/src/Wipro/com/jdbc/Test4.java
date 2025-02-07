package Wipro.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

// program for metadata
public class Test4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro_training?useSSL=false&allowPublicKeyRetrieval=true","root", "25sep19nov");
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * From emp");
		
		ResultSetMetaData rsmd =  resultSet.getMetaData();
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			
		System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i) + " " + rsmd.getPrecision(i));	
		}
		
		connection.close();
		
	}

}
