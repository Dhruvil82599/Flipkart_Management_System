package flipkart;

import java.sql.SQLException;
import java.util.Scanner;

import dao.Login;
import dao.Register;

public class Flipcart {

	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to Flipcart");

		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to Register");
		System.out.println("Press 3 to Exit");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			Login.isLogin();
			break;
		case 2:
			Register.customerRegister();
		}
	}

}
