package com.ui;

import java.sql.Connection;
import java.util.Scanner;

import jdbc.connection.CRUD;
import jdbc.connection.Conn;

public class Driver {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Connection conn = Conn.tryConnection();
			int choice = 0;
			do {
				System.out.println("Student Database: ");
				System.out.println("1. Add Student");
				System.out.println("2. Update Student");
				System.out.println("3. Delete Student");
				System.out.println("4. View All Students");
				System.out.println("0. Exit");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				switch (choice) {
					case 1:
						CRUD.create(conn, sc);
						break;
					case 2:
						CRUD.update(conn, sc);
						break;
					case 3:
						CRUD.delete(conn, sc);
						break;
					case 4:
						CRUD.read(conn);
						break;
				}
			} while (choice != 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
