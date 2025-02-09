package dao;

import java.sql.Connection;
import java.util.Scanner;

public class Login {

	public static void isLogin() {

		System.out.println("********* Welcome to Login Page *********");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Email");
		String email = sc.next();

		System.out.println("Enter Password");
		String password = sc.next();

		Connection connection = ConnectionPool.getConnectionObject();

		// Write a query to check if the email and password are correct

		pre

		// If the email and password are correct, print "Login Successful"
		// If the email and password are incorrect, print "Login Failed"




	}
}
