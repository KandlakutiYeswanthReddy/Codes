package com.luv2code.JDBC;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception 
	{
		
		String url ="jdbc:mysql://localhost:3307//sakila";
		String uname ="root";
		String pass ="root";
		String query = "SELECT * FROM sakila.student;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("studentName");
		
		System.out.println(name);
		
		st.close();
		con.close();

	}

}
