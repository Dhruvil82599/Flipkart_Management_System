package flipkart;

import java.util.Scanner;

import dao.Register;

public class Flipcart {

	public static void main(String[] args) {
		System.out.println("Welcome to Flipcart");

		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to Legister");
		System.out.println("Press 3 to Exit");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			Register.customerRegister();
		}
	}

}
