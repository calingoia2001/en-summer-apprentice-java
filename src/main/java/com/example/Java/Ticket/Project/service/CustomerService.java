package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements iCustomerService {
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
                () -> new IllegalStateException(String.format("Customer with id %s doesnt exist!", customerID)));
        customerToUpdate.setCustomerName(customer.getCustomerName());
        customerToUpdate.setEmail(customer.getEmail());
        customerRepository.save(customerToUpdate);
    }
}
