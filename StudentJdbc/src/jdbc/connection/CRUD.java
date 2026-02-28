package jdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUD {
	public static void read(Connection conn) throws SQLException {
		PreparedStatement s = conn.prepareStatement("SELECT * FROM student");
		try {
			ResultSet rs = s.executeQuery();
			System.out.println("Id\tName\tMarks");
			while(rs.next()) System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		} finally {s.close();}
	}
	public static void create(Connection conn, Scanner sc) throws SQLException {
		PreparedStatement s = conn.prepareStatement("INSERT INTO student VALUES (?, ?, ?)");
		try {
			System.out.println("Enter New Student Id, Name, Marks to Insert:");
			s.setInt(1, sc.nextInt());
			s.setString(2, sc.next());
			s.setDouble(3, sc.nextDouble());
			sc.nextLine();
			s.executeUpdate();
		} finally {s.close();}
	}
	public static void update(Connection conn, Scanner sc) throws SQLException {
		PreparedStatement s = conn.prepareStatement("UPDATE student SET name = ?, marks = ? WHERE id = ?");
		try {
			System.out.println("Enter Student Id to Update: ");
			s.setInt(3, sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Student Name, Marks: ");
			s.setString(1, sc.next());
			s.setDouble(2, sc.nextDouble());
			sc.nextLine();
			s.executeUpdate();
		} finally {s.close();}
	}
	public static void delete(Connection conn, Scanner sc) throws SQLException {
		PreparedStatement s = conn.prepareStatement("DELETE FROM student WHERE id = ?");
		try {
			System.out.println("Enter Student Id to Delete: ");
			s.setInt(1, sc.nextInt());
			sc.nextLine();
			s.executeUpdate();
		} finally {s.close();}
	}
}
