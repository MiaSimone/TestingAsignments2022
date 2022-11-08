package main;

import datalayer.CustomerStorageImpl;
import dto.Customer;

import java.sql.SQLException;

public class Main {

    private static final String conStr = "jdbc:mysql://localhost:3306/assignment3?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "Cristine535";

    public static void main(String[] args) throws SQLException {
        CustomerStorageImpl storage = new CustomerStorageImpl(conStr, user, pass);

        System.out.println("Got customers: ");
        for(Customer c : storage.getCustomers()) {
            System.out.println(toString(c));
        }
        System.out.println("The end.");
    }

    public static String toString(Customer c) {
        return "{" + c.getId() + ", " + c.getFirstname() + ", " + c.getLastname() + "}";
    }
}
