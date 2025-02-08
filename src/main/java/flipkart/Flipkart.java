package flipkart;

import java.util.Scanner;

import dao.Register;

public class Flipkart {

	public static void main(String[] args) {
		System.out.println("---------------Welcome to Flipkart! ---------------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Press 1 to Register");
		System.out.println("Press 2 to Login");
		System.out.println("Press 3 to Exit");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			Register.register();
			break;
		}

	}

}
