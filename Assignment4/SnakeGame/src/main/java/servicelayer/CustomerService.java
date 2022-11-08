package servicelayer;

import dto.Customer;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

public interface CustomerService {
    int createCustomer(String firstName, String lastName, String phoneNr,Date birthdate) throws CustomerServiceException;
    Customer getCustomerById(int id) throws SQLException;
    Collection<Customer> getCustomersByFirstName(String firstName);
}