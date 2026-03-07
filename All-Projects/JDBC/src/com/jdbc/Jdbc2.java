package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import user.data.User;

public class Jdbc2 {
	public static String url = "jdbc:mysql://localhost:3306/jdbc";
	public static String username = User.getUsername();
	public static String password = User.getPassword();
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
			
			System.out.println("Update Table: ");
			System.out.print("Enter Old Id: ");
			int oldId = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter New Id: ");
			int newId = sc.nextInt();
			sc.nextLine();
			
//			PreparedStatement ps = con.prepareStatement("SELECT * FROM student WHERE id = ?");
			PreparedStatement ps = con.prepareStatement("UPDATE student SET id = ? WHERE id = ?");
			ps.setInt(1, newId);
			ps.setInt(2, oldId);
			ps.executeUpdate();
			ResultSet rs = ps.executeQuery("SELECT * FROM student");
			System.out.println("Id\tName\tAge\tClass\tEmail");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"
									+rs.getString(2)+"\t"
									+rs.getInt(3)+"\t"
									+rs.getInt(4)+"\t"
									+rs.getString(5));
			}
			
			System.out.println("Insert Into Table: ");
			System.out.print("Enter Name, Age, Standard, Email: ");
			String name = sc.next();
			int age = sc.nextInt();
			int std = sc.nextInt();
			String email = sc.next();
			sc.nextLine();
			
			ps = con.prepareStatement("INSERT INTO student (name, age, standard, email) VALUES (?, ?, ?, ?)");
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setInt(3, std);
			ps.setString(4, email);
			ps.execute("SELECT * FROM student");
			rs = ps.executeQuery("SELECT * FROM student");
			System.out.println("Id\tName\tAge\tClass\tEmail");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"
									+rs.getString(2)+"\t"
									+rs.getInt(3)+"\t"
									+rs.getInt(4)+"\t"
									+rs.getString(5));
			}
			con.close();
			sc.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
