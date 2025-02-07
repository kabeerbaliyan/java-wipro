package Wipro.com.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro_training?useSSL=false&allowPublicKeyRetrieval=true","root", "25sep19nov");
		// TODO Auto-generated method stub
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from emp");
		While (resultSet.next()){
			System.out.println(resultSet.getInt(1));
		}
	}

}
