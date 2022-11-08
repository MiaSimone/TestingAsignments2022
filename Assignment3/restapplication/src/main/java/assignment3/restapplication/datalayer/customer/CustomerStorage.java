package assignment3.restapplication.datalayer.customer;

import assignment3.restapplication.dto.customer.Customer;
import assignment3.restapplication.dto.customer.CustomerCreation;

import java.sql.SQLException;
import java.util.List;

public interface CustomerStorage {
    public Customer getCustomerWithId(int customerId) throws SQLException;
    public List<Customer> getCustomers() throws SQLException;
    public int createCustomer(CustomerCreation customerToCreate) throws SQLException;
}
