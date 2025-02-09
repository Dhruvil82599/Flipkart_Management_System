package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import entity.Customer;

public class Register {

    public static void customerRegister() {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.next();

        System.out.println("Enter your Email");
        String email = sc.next();

        System.out.println("Enter your Address");
        String address = sc.next();

        System.out.println("Enter your Phone");
        Long phone = sc.nextLong();

        System.out.println("Enter your Password");
        String password = sc.next();

        Customer customer = new Customer();

        customer.setCustomerName(name);
        customer.setCustomerEmail(email);
        customer.setCustomerAddress(address);
        customer.setCustomerPhone(phone);
        customer.setCustomerPassword(password);

        Connection connectionPool = ConnectionPool.getConnectionObject();

        String insert = "insert into customer values (NEXTVAL('customer_id'),?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connectionPool.prepareStatement(insert);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerEmail());
            preparedStatement.setString(3, customer.getCustomerAddress());
            preparedStatement.setLong(4, customer.getCustomerPhone());
            preparedStatement.setString(5, customer.getCustomerPassword());

            int i = preparedStatement.executeUpdate();

            if (i > 0) {
                System.out.println("Customer Registered Successfully");
            } else {
                System.out.println("Customer Registration Failed");
            }

            preparedStatement.close();
            connectionPool.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
