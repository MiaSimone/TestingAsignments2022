package assignment3.restapplication.servicelayer.customer;


import assignment3.restapplication.dto.customer.Customer;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

public interface CustomerService {
    int createCustomer(String firstName, String lastName, String phoneNr,Date birthdate) throws CustomerServiceException;
    Customer getCustomerById(int id) throws SQLException;
    Collection<Customer> getCustomersByFirstName(String firstName);
}
