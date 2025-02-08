package dao;

import java.sql.Connection;
import java.util.Scanner;

import entity.CustomerEntity;

public class Register {

	public static void register() {
		System.out.println("----------Register Your Self Here ----------s");
		Scanner scanner = new Scanner(System.in);

		CustomerEntity c = new CustomerEntity();

		System.out.println("Enter Customer Name");
		String customer_name = scanner.next();

		System.out.println("Enter Customer Email");
		String customer_email = scanner.next();

		System.out.println("Enter Customer Password");
		String customer_password = scanner.next();

		System.out.println("Enter Customer Phone");
		Long customer_phone = scanner.nextLong();

		System.out.println("Enter Customer Address");
		String customer_address = scanner.next();

		c.setCustomer_name(customer_name);
		c.setCustomer_email(customer_email);
		c.setCustomer_address(customer_address);
		c.setCustomer_phone(customer_phone);
		c.setCustomer_password(customer_password);

		Connection connectionPool = ConnectionPool.getConnectionObject();

		

	}
}
