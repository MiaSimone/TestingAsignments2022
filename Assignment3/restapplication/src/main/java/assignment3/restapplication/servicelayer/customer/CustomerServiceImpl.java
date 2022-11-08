package assignment3.restapplication.servicelayer.customer;


import assignment3.restapplication.datalayer.customer.CustomerStorage;
import assignment3.restapplication.dto.customer.Customer;
import assignment3.restapplication.dto.customer.CustomerCreation;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

public class CustomerServiceImpl implements CustomerService {

    private CustomerStorage customerStorage;

    public CustomerServiceImpl(CustomerStorage customerStorage) {
        this.customerStorage = customerStorage;
    }

    @Override
    public int createCustomer(String firstName, String lastName,String phoneNr, Date birthdate) throws CustomerServiceException {
        try {
            return customerStorage.createCustomer(new CustomerCreation(firstName, lastName,phoneNr));
        } catch (SQLException throwables) {
            throw new CustomerServiceException(throwables.getMessage());
        }
    }

    @Override
    public Customer getCustomerById(int id) throws SQLException {
        return customerStorage.getCustomerWithId(id);
    }

    @Override
    public Collection<Customer> getCustomersByFirstName(String firstName) {
        return null;
    }
}
