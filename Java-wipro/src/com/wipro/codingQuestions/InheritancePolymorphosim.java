package com.wipro.codingQuestions;

public class InheritancePolymorphosim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



package com.wipro.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
 
import com.wipro.model.Employee;
 
public class EmployeeDAO {
 
	
	/*
	 * private static List<Employee> employees = new ArrayList<>();
	 *
	 * public void addEmployee(Employee emp) { employees.add(emp); }
	 *
	 * public List<Employee> getEmployees() { return employees; }
	 */
	
	/*
	 * private String url; private String user; private String password; private
	 * String driver;
	 */
	public EmployeeDAO()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//add Employee to database
	
	public void addEmployee(Employee emp)
	{
		String sql = "insert into employees(name,department) values(?,?)";
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?useSSL=false","root","root");
				PreparedStatement stmt  = conn.prepareStatement(sql)){
			stmt.setString(1, emp.getName());
			stmt.setString(2, emp.getDepartment());
			stmt.executeUpdate();
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	//Retrieve employees from database
	
	public List<Employee> getEmployees()
	{
		
		List<Employee> employees  = new ArrayList<>();
		String sql = "SELECT * FROM employees";
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?useSSL=false","root","root");
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery())
		{
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt("id"),rs.getString("name"),rs.getString("department"));
				employees.add(emp);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employees;
	}
	
	
	
	
}//class closing
 
 
package com.wipro.controller;
 
import java.io.IOException;

import java.util.List;
 
import com.wipro.dao.EmployeeDAO;

import com.wipro.model.Employee;
 
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;
 
/**

* Servlet implementation class EmployeeServlet

*/

@WebServlet("/EmployeeServlet")

public class EmployeeServlet extends HttpServlet {
 
	private EmployeeDAO employeeDAO = new EmployeeDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");

		String department = request.getParameter("department");

		Employee emp = new Employee(0,name,department);

		employeeDAO.addEmployee(emp);

		//response.sendRedirect("viewEmployees.jsp");

		doGet(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		List<Employee> employees = employeeDAO.getEmployees();

		request.setAttribute("employees", employees);

		request.getRequestDispatcher("viewEmployees.jsp").forward(request, response);

	}

}

 
