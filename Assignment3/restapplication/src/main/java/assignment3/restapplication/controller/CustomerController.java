package assignment3.restapplication.controller;

import assignment3.restapplication.model.Customer;
import assignment3.restapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Component
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerController() {
    }

    @RequestMapping( "/working" )
    public String checkIfWorking() {
        return "It's working...!";
    }

    @GetMapping("/all")
    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable(value = "id") long id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if(customer.isPresent()) {
            return ResponseEntity.ok().body(customer.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Customer saveCustomer(@Validated @RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}
