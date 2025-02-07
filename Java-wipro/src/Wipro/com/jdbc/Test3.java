package Wipro.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// to process dynamic query
public class Test3 {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro_training?useSSL=false&allowPublicKeyRetrieval=true","root", "25sep19nov");
		
		PreparedStatement ps = connection.prepareStatement("INSERT INTO emp values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EmpID: ");
		int emp_id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Emp FirstName: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the Emp LastName: ");
		String lastName = sc.nextLine();
		
		
		ps.setInt(1, emp_id);
		ps.setString(2,firstName);
		ps.setString(3, lastName);
		int x = ps.executeUpdate();
		System.out.println(x+"Rows inserted");
		connection.close();
		
	}

	}


