package fr.poec.gestion_rh;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	Login log = new Login();

	try(
	Statement statement = conn.createStatement())
	{
		ResultSet rs = statement.executeQuery("SELECT * FROM login");
	}while(rs.next())
	{
		int id = rs.getInt("id");
		int idEmployee = rs.getInt("id_employee");
		String role = rs.getString("role");
		String user = rs.getString("login");
		Integer password = rs.getString("MdP");

		list.add(new Login(id, idEmployee, role, user, password));
	}

	rs.close();catch(
	SQLException e)
	{
		e.printStackTrace();
	}

	public boolean connection(String user, String password) {

		return connection;
	}

	// Get id.
	public int getId() {
		return id;
	}

	// Set id.
	public int SetId() {
		this.id = id;
	}

	// Get id_employee.
	public int getIdEmployee() {
		return idEmployee;
	}

	// Set id_employee.
	public int SetIdEmployee() {
		this.idEmployee = idEmployee;
	}

	// Get role.
	public String getRole() {
		return role;
	}

	// Set role.
	public int SetRole() {
		this.role = role;
	}

	// Get user.
	public String getUser() {
		return user;
	}
	
	// Set user.
		public int SetUser() {
			this.user = user;
		}

	// Get user password.
	public String getPassword() {
		this.password = password;
	}
	
	// Set password.
			public int SetPassword() {
				return password;
			}
}