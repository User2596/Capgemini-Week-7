package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import user.data.User;

public class Jdbc {
	public static String url = "jdbc:mysql://localhost:3306/jdbc";
	public static String username = User.getUsername();
	public static String password = User.getPassword();
	
	public static void main(String[] args) throws SQLException {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
			Statement st = con.createStatement();
//			st.execute("TRUNCATE TABLE student");
			ResultSet rs = st.executeQuery("SELECT * FROM student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"
									+rs.getString("name")+"\t"
									+rs.getInt("age")+"\t"
									+rs.getInt(4)+"\t"
									+rs.getString(5));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
