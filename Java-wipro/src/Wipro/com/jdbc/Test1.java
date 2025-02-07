package Wipro.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		//load the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver classs loader");
		// obtain the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro_training?useSSL=false&allowPublicKeyRetrieval=true","root", "25sep19nov");
		System.out.println("i got the connection from db");
		
		//create the statement object
		
		Statement statement = connection.createStatement();
		//send the queries
		//int x1 =statement.executeUpdate("INSERT into emp values(1,'Kabeer','Baliyan')");
		/*int x2 = statement.executeUpdate("INSERT INTO emp VALUES (2, 'Mayank', 'Tomar')");
		int x3 = statement.executeUpdate("INSERT INTO emp VALUES (3, 'Mayank ', 'Chaudhary')");
		int x4 = statement.executeUpdate("INSERT INTO emp VALUES (4, 'Satyam', 'Chaudhary')");
		int x5 = statement.executeUpdate("INSERT INTO emp VALUES (5, 'Sarang', 'Rathi')");
		*/
		
				// System.out.println((x2+x3+x4+x5) + "row(s) inserted");
		
		
	//  UPDATE Some Rows
        int updatedRows = statement.executeUpdate("UPDATE emp SET lastName = 'Sharma' WHERE emp_id = 3");
        System.out.println(updatedRows + " row(s) updated.");

        //  DELETE Some Rows
        int deletedRows = statement.executeUpdate("DELETE FROM emp WHERE emp_id = 4 OR emp_id = 5");
        System.out.println(deletedRows + " row(s) deleted.");
        
        ResultSet resultset = statement.executeQuery("SELECT * From emp WHERE emp_id = 1");
        System.out.println("Selected Employee(ID =1)");
        if(resultset.next()) {
        	int id = resultset.getInt("emp_id");
        	String firstname = resultset.getString("firstName");
        	String lastname = resultset.getString("lastName");
        	System.out.println("ID: "+id+", FIRST NAME: "+ firstname+", LAST NAME: "+lastname);
        }
        else {
        	System.out.println("No Employee Found With ID=1");
        }
		}

}
