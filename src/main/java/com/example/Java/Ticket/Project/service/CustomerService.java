package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Long customerID, Customer customer) {
        Customer customerToUpdate = customerRepository.findById(customerID).orElseThrow(
                () -> new IllegalStateException(String.format("Customer with id %s doesn't exist!", customerID)));
        customerToUpdate.setCustomerName(customer.getCustomerName());
        customerToUpdate.setEmail(customer.getEmail());
        customerRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(Long customerID) {
        boolean customerExists = customerRepository.existsById(customerID);
        if(!customerExists) {
            throw new IllegalStateException(String.format("Employee with ID %s does not exist!", customerID));
        }
        customerRepository.deleteById(customerID);
    }

}
