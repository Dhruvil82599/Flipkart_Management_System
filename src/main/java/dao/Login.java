package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	public static void isLogin() throws SQLException {

		System.out.println("********* Welcome to Login Page *********");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Email");
		String email = sc.next();

		System.out.println("Enter Password");
		String password = sc.next();

		Connection connection = ConnectionPool.getConnectionObject();

		// Write a query to check if the email and password are correct


		String query = "select isvalid(?,?)";
		PreparedStatement ps = connection.prepareCall(query);
		
		ps.setString(1, email);
		ps.setString(2, password);
		
		int i=ps.executeUpdate();
		
		if(i==1) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
		
		

		
	}
}
